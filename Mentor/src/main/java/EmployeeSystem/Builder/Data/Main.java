package Data;

import Util.*;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        startProject();
    }


    public static void startProject() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Choose section  1-register  2-Show all  3-Search  4-Update  5-Delete  6-Exit");
        int section = sc.nextInt();

        switch (section) {
            case 1: {
                Register.register();
                break;
            }
            case 2: {
                ShowAll.showAll();
                break;
            }
            case 3: {
                Search.searchEmployee();
                break;
            }
            case 4: {
                Update.updateEmployee();
                break;
            }
            case 5: {
                Delete.deleteEmployee();
                break;
            }
            case 6: {
                System.out.println("Exit");
                return;
            }
        }
        System.out.println("*--------------------------------------*");
        startProject();
    }
}

