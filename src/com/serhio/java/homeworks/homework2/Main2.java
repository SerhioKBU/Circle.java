package com.serhio.java.homeworks.homework2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main2 {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        int radius = 0;
        PointList pointList = new PointList();

        boolean flag = true;
        Scanner scanner = null;
        while (flag) {
            scanner = new Scanner(System.in);
            double x, y;
            int selection;
            System.out.println("Enter point coordinate: ");

            while (true) {
                System.out.print("x = ");
                if (scanner.hasNextDouble()) {
                    x = scanner.nextDouble();
                    scanner.nextLine();
                    break;
                } else {
                    scanner.nextLine();
                    System.out.println("Enter the number");
                }
            }

            while (true) {
                System.out.print("y = ");
                if (scanner.hasNextDouble()) {
                    y = scanner.nextDouble();
                    scanner.nextLine();
                    break;
                } else {
                    scanner.nextLine();
                    System.out.println("Enter the number");
                }
            }

            System.out.print("radius = ");
            radius = scanner.nextInt();

            pointList.addPoint(new Point(x, y));

//            System.out.print("Do you wanna add one more? Y - YES, N - NO)? ");
//            String answer = scanner.nextLine();
//
//            switch (answer) {
//                case "yes":
//                    flag = true;
//                    break;
//                case "no":
//                    flag = false;
//                    break;
//                default :
//                    System.out.println("You wrote wrong answer");
//            }

            while (true) {
                System.out.print("Do you wanna add one more? (1 - YES, 2 - NO)? ");
                if (scanner.hasNextInt()) {
                    selection = scanner.nextInt();
                    scanner.nextLine();
                    if (selection == 1 || selection == 2) {
                        break;
                    } else {
                        System.out.println("Make your selection");
                    }
                } else {
                    scanner.nextLine();
                    System.out.println("Try again!");
                }
            }

            if (selection == 2) {
                flag = false;
            }
        }

        for (int i = 0; i < pointList.size(); i++) {
            System.out.println(i + 1 + ". " + pointList.getIndex(i).toString());
        }

        Circle circle = new Circle(Point.ORIGIN, radius);

        for (int i = 0; i < pointList.size(); i++) {
            if (circle.containsPoint(pointList.getIndex(i))) {
                System.out.println(pointList.getIndex(i).toString() + " - Point has contained in circle");
            } else {
                System.out.println(pointList.getIndex(i).toString() + " - Point hasn't contained in circle");
            }
        }

        System.out.print(ANSI_RED + "Pick some index for writing it in log file: " + ANSI_RESET);
        int index = scanner.nextInt();
                // you enter the direction witch you wanna save your log file
        try (FileWriter fileWriter = new FileWriter("E:/HomeWork2.txt")) {
            fileWriter.write(String.format("%s", pointList.getIndex(index - 1).toString()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("You will be able to find the following index in next directory: E:/HomeWork2.txt");
    }
}
