package Util;

import Data.Employee;

import java.io.*;
import java.util.Scanner;

public class Update {

    public static void updateEmployee() {
        ShowAll.showAll();

        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter id of student who you want to update");
        int id = sc.nextInt();

        writeObjectToFile(changeData(id), "Employee.txt");
    }


    public static Employee[] changeData(int id) {
        Scanner sc = new Scanner(System.in);

        System.out.println("change 1:name  2:surname  3:age  4:salary   5:EXIT");
        int section = sc.nextInt();


        int index = -1;
        Employee[] arr = (Employee[]) readObjectFromFile("Employee.txt");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getId() == id) {
                index = i;
            }
        }


        switch (section) {
            case 1: {
                System.out.println("Enter name");
                String name = sc.next();
                arr[index].setName(name);
                changeData(id);
                break;
            }
            case 2: {
                System.out.println("Enter surname");
                String surname = sc.next();
                arr[index].setSurname(surname);
                changeData(id);
                break;

            }
            case 3: {
                System.out.println("Enter age");
                int age = sc.nextInt();
                arr[index].setAge(age);
                changeData(id);
                break;

            }
            case 4: {
                System.out.println("Enter salary");
                double salary = sc.nextDouble();
                arr[index].setSalary(salary);
                changeData(id);
            }
            case 5: {
                System.out.println();
            }

        }
        return arr;
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
