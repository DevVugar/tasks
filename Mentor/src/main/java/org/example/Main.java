package org.example;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Main {
    public static void main(String[] args) {
        try {
            Robot robot = new Robot();
            String message = "he";
            int number = 1000;

            // Pause for 2 seconds
            Thread.sleep(4000);

            // Typing the message 'number' times
            for (int i = 0; i < number; i++) {
                typeMessage(robot, message);
                pressEnter(robot);
            }
        } catch (AWTException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Method to type the message
    public static void typeMessage(Robot robot, String message) {
        for (char c : message.toCharArray()) {
            robot.keyPress(KeyEvent.getExtendedKeyCodeForChar(c));
            robot.keyRelease(KeyEvent.getExtendedKeyCodeForChar(c));
        }
    }

    // Method to press Enter
    public static void pressEnter(Robot robot) {
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }
}
