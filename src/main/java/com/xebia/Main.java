package com.xebia;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        LoginService service = new LoginService();

        if (service.login(username, password)) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Invalid Credentials");
        }

        sc.close();
    }
}