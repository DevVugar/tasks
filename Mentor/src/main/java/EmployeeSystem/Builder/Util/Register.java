package Util;

import Data.Data;
import Data.Developer;
import Data.Employee;
import Data.Instructor;

import java.io.*;
import java.util.Scanner;

public class Register {
    public static void register() {

        Scanner sc2 = new Scanner(System.in);
        System.out.println("How many employees will be registered");
        int countOfEmployee = sc2.nextInt();

        Employee[] mainArr = new Employee[countOfEmployee];


        for (int i = 0; i < mainArr.length; i++) {



            System.out.println("Who will be registered  1:Developer  2:Instructor");
            int c = sc2.nextInt();

            System.out.println("User " + (i + 1) + " Enter id:");
            int id = sc2.nextInt();

            System.out.println("User " + (i + 1) + " Enter name:");
            String name = sc2.next();


            System.out.println("User " + (i + 1) + " Enter surname:");
            String surname = sc2.next();


            System.out.println("User " + (i + 1) + " Enter age:");
            int age = sc2.nextInt();


            System.out.println("User " + (i + 1) + " Enter salary:");
            Double salary = sc2.nextDouble();


            if (c == 1) {

                System.out.println("Give info about job of developer");
                String devWork = sc2.next();
                mainArr[i] = new Developer(id,name, surname, age, salary, devWork);
            } else if (c == 2) {

                System.out.println("Give info about job of instructor");
                String InstWork = sc2.next();
                mainArr[i] = new Instructor(id,name, surname, age, salary, InstWork);
            }
        }
        Data.arr = mainArr;


        Employee[] arrFile = (Employee[]) readObjectFromFile("Employee.txt");
        if (arrFile != null) {
            Employee[] supplementArr = new Employee[arrFile.length + mainArr.length];
            for (int i = 0; i < arrFile.length; i++) {
                supplementArr[i] = arrFile[i];
            }

            int b = 0;
            for (int j = arrFile.length; j < supplementArr.length; j++) {
                supplementArr[j] = mainArr[b];
                b++;
            }
            Data.arr = supplementArr;
        }


        writeObjectToFile(Data.arr, "Employee.txt");
    }


    public static void writeObjectToFile(Serializable object, String fileName) {
        try (
                FileOutputStream FileStream = new FileOutputStream(fileName);
                ObjectOutputStream ObjectStream = new ObjectOutputStream(FileStream);
        ) {

            ObjectStream.writeObject(object);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static Object readObjectFromFile(String name) {
        Object object = null;

        try {
            FileInputStream fileInputStream = new FileInputStream(name);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            object = objectInputStream.readObject();

            fileInputStream.close();
            objectInputStream.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            return object;
        }
    }
}
