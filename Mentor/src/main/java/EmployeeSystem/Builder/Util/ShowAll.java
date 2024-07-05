package Util;

import Data.Employee;

import java.io.*;

public class ShowAll {

    public static void showAll() {
        Employee[] arr = (Employee[]) readObjectFromFile("Employee.txt");
        for (Employee e : arr) {
            System.out.println(e.toString());
        }
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