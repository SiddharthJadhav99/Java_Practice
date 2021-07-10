package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Basics of creating objects

         //creating object

        /*Student rob = new Student();
        rob.student_id = 121;
        rob.marks = 95;
        System.out.println(rob.student_id);
        System.out.println(rob.marks);



        //Creating new object


        Student John = new Student();
        John.student_id = 123;
        John.marks = 89;
        System.out.println(John.student_id);
        System.out.println(John.marks);*/


        //Using method


        /*Student rob = new Student();
        rob.phy = 89;
        rob.chem = 66;
        rob.math = 99;
        rob.percentage();*/


        //Using method with return type;


        /*Student rob = new Student();
        rob.phy = 89;
        rob.math = 99;
        rob.chem = 75;

        double result = rob.percentage();
        System.out.println("Percentage = " + result);*/


        //Now giving parameters to the functions


        /*Student rob = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the physics marks ");
        rob.phy = sc.nextInt();
        System.out.println("Enter the Chemistry Marks ");
        rob.chem = sc.nextInt();
        System.out.println("Enter the Maths Marks ");
        rob.math = sc.nextInt();
        int sum = rob.total();
        double per = rob.percentage(sum);
        System.out.println("The total of marks is " + sum);
        System.out.println("Percentage = " + per);*/


        //Using Constructor


        /*Student rob = new Student();
        System.out.println(rob.id);*/


        //Using Parameterised Constructor


        // Student rob = new Student(5, 98,76,99);
        // System.out.println("ID = " + rob.id);
        // System.out.println("Physics = " + rob.phy);
        // System.out.println("Chemistry = " + rob.chem);
        // System.out.println("Maths = " + rob.maths);

        double num,num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number" );
         num = sc.nextDouble();
        System.out.println("Enter the second number ");
         num2 = sc.nextDouble();
        Double d= num;
        Double d2= num2;
        Double result;
        result = d/d2;
        System.out.println("Division = " + result);
        sc.close();
    }
}
