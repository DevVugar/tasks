package Util;

import Data.Employee;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Delete {
    public static Employee[] deleteEmployee() {
        Employee[] arr = (Employee[]) readObjectFromFile("Employee.txt");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id which do you want to delete");
        int deletedEmplyeeId = sc.nextInt();
        int index=0;
        for(Employee e:arr){
            if(e.getId()==deletedEmplyeeId){
                deletedEmplyeeId=index;
            }
            index++;
        }




        Employee[] arr2 = new Employee[arr.length - 1];
        for (int i = 0; i < deletedEmplyeeId; i++) {
            arr2[i] = arr[i];
        }
        for (int i = deletedEmplyeeId; i < arr2.length; i++) {
            arr2[i] = arr[i + 1];
        }
        writeObjectToFile(arr2, "Employee.txt");


        return arr2;
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
            System.out.println(e.getMessage());
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
