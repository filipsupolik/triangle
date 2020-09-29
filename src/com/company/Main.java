package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter variable a :" );
        int a = scan.nextInt();
        System.out.println("Enter variable b:");
        int b = scan.nextInt();
        System.out.println("Enter variable c:");
       int c = scan.nextInt();
        scan.close();

        if (c<b||c<a)
            System.out.println(true);
        else
            System.out.println(false);
        if (a+b>c)
            System.out.println(true);
        else
            System.out.println(false);
    }
}
