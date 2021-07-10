package com.company;

import java.util.Scanner;

public class Basic {

    public static void main(String[] args) {
        /*int age;
        age = 20;
        System.out.println(age);
        System.out.println("Hello there, my age is " + age);

        //data types

        float percentage = 1.1234567f;
        System.out.println(percentage);
        char name;
        name = 'S';
        System.out.println(name);
        boolean c;
        if (100 > age) c = true;
        else c = false;
        System.out.println(c);

        //non primitive array

        int marks[]; //declaring
        marks = new int[5]; //memory allocation
        marks[0] = 100; //value assignment
        marks[1] = 200;
        marks[2] = 300;
        marks[3] = 400;
        marks[4] = 500;

        //simpler way which we know already.

        int score[] = {100,200,300,400,500};
        System.out.println(marks[1]);

        float height[] = {10, 20, 15, 14};
        System.out.println(height[1]);

        //arithmatic operations

        int a = 10;
        int b = 20;
        int c = a+b;
        int d = a-b;
        int e = a*b;
        int f = a/b;
        int g = a%b;

        System.out.println("Addition of " + a + " and " + b + " is " + c );
        System.out.println("Subtraction of " + a + " and " + b + " is " + d );
        System.out.println("Multiplication of " + a + " and " + b + " is " + e );
        System.out.println("Division of " + a + " and " + b + " is " + f );
        System.out.println("Remainder of " + a + " and " + b + " is " + g );*/

        //accepting values from user

        System.out.println("Enter a number ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("You entered " + num);
        sc.close();

    }
}
