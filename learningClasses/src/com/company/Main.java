package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        bankaccount Alex = new bankaccount("00797463", 3000, "(613)-790-7366", "Alexander M Gunther", "alexander.gunther@gmail.com");

        System.out.println("The account is registered under " + Alex.getCustomerName());
        System.out.println("Your account number is " + Alex.getAccountNumber());
        System.out.println("Your balance in Canadian Dollars is " + Alex.getBalance() + " CDN");
        System.out.println("The phone number you provided us with is " + Alex.getPhoneNumber());
        System.out.println("The email you provided us with is " + Alex.getEmail());

        Alex.deposit(500);

        Alex.widthdrawl(25);

        Alex.widthdrawl(2000);
    }
}