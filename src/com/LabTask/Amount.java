package com.LabTask;

import java.util.Scanner;

public class Amount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount: ");
        int amount = sc.nextInt();

        int note2000 = amount / 2000;
        amount = amount % 2000;

        int note500 = amount / 500;
        amount = amount % 500;

        int note200 = amount / 200;
        amount = amount % 200;

        int note100 = amount / 100;
        amount = amount % 100;

        int note50 = amount / 50;
        amount = amount % 50;

        int note20 = amount / 20;
        amount = amount % 20;

        int note10 = amount / 10;
        amount = amount % 10;

        int note5 = amount / 5;
        amount = amount % 5;

        int note2 = amount / 2;
        amount = amount % 2;

        int note1 = amount;

        System.out.println("\nCurrency Breakdown:");
        System.out.println("2000 notes: " + note2000);
        System.out.println("500 notes: " + note500);
        System.out.println("200 notes: " + note200);
        System.out.println("100 notes: " + note100);
        System.out.println("50 notes: " + note50);
        System.out.println("20 notes: " + note20);
        System.out.println("10 notes: " + note10);
        System.out.println("5 notes: " + note5);
        System.out.println("2 notes: " + note2);
        System.out.println("1 notes: " + note1);
        

        sc.close();
    }
}