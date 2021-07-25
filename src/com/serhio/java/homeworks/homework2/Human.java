package com.serhio.java.homeworks.homework2;

import java.util.Scanner;

class Human {
    private String firstName;
    private String surname;
    private String patronymic;

    public Human(String surname, String firstName) {
        this.firstName = firstName;
        this.surname = surname;
    }

    public Human(String surname, String firstName,String patronymic) {
        this(surname, firstName);
        this.patronymic = patronymic;
    }

    public String getFullName() {
        return surname + " " + firstName + " " + (patronymic == null? "":patronymic);
    }

    public String getShortName() {
        return surname + " " + firstName.charAt(0) + "." + (patronymic == null? "":patronymic.charAt(0) + ".");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your SURNAME: ");
        String surname = scanner.nextLine();
        System.out.print("Enter your FIRSTNAME: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter your PATRONYMIC: ");
        String patronymic = scanner.nextLine();
        Human human = new Human(surname, firstName, patronymic);
        System.out.println("S.F.P. " + human.getFullName() + " = " + human.getShortName());
    }
}
