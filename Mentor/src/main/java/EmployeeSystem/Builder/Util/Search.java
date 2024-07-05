package Util;

import Data.Employee;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Search {


    public static void searchEmployee() {
        Employee[] arr = (Employee[]) readObjectFromFile("Employee.txt");

        Scanner sc = new Scanner(System.in);
        System.out.println("1-Id 2-Name 3-Surname 4-age 5-salary");
        int section = sc.nextInt();
        switch (section) {
            case 1: {

                getEmployees(searchWithId(arr));
                break;
            }
            case 2: {
                getEmployees(searchWithName(arr));
                break;
            }
            case 3: {
                getEmployees(searchWithSurname(arr));
                break;
            }
            case 4: {
                getEmployees(searchWithAge(arr));
                break;
            }
            case 5: {
                getEmployees(searchWithSalary(arr));
            }
        }

    }

    public static Employee[] searchWithName(Employee[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = sc.next();

        int employeeCount = 0;
        for (Employee a : arr) {
            if (a.getName().equals(name)) {
                employeeCount++;
            }
        }

        int count = 0;
        Employee[] employeeArr = new Employee[employeeCount];
        for (Employee a : arr) {
            if (a.getName().equals(name)) {
                employeeArr[count] = a;
                count++;
            }
        }

        return employeeArr;
    }


    public static Employee[] searchWithId(Employee[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id:");
        int id = sc.nextInt();

        int employeeCount = 0;
        for (Employee a : arr) {
            if (a.getId() == id) {
                employeeCount++;
            }
        }

        int count = 0;
        Employee[] employeeArr = new Employee[employeeCount];
        for (Employee a : arr) {
            if (a.getId() == id) {
                employeeArr[count] = a;
                count++;
            }
        }
        return employeeArr;
    }

    public static Employee[] searchWithSurname(Employee[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter surname:");
        String name = sc.next();

        int employeeCount = 0;
        for (Employee a : arr) {
            if (a.getSurname().equals(name)) {
                employeeCount++;
            }
        }

        int count = 0;
        Employee[] employeeArr = new Employee[employeeCount];
        for (Employee a : arr) {
            if (a.getSurname().equals(name)) {
                employeeArr[count] = a;
                count++;
            }
        }

        return employeeArr;
    }

    public static Employee[] searchWithAge(Employee[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age:");
        int id = sc.nextInt();

        int employeeCount = 0;
        for (Employee a : arr) {
            if (a.getAge() == id) {
                employeeCount++;
            }
        }

        int count = 0;
        Employee[] employeeArr = new Employee[employeeCount];
        for (Employee a : arr) {
            if (a.getAge() == id) {
                employeeArr[count] = a;
                count++;
            }
        }
        return employeeArr;
    }

    public static Employee[] searchWithSalary(Employee[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter salary:");
        double id = sc.nextDouble();

        int employeeCount = 0;
        for (Employee a : arr) {
            if (a.getSalary() == id) {
                employeeCount++;
            }
        }

        int count = 0;
        Employee[] employeeArr = new Employee[employeeCount];
        for (Employee a : arr) {
            if (a.getSalary() == id) {
                employeeArr[count] = a;
                count++;
            }
        }
        return employeeArr;
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

    public static void getEmployees(Employee[] employeeArr) {
        for (Employee e : employeeArr) {
            System.out.println(e.toString());
        }
    }
}
