package com.company;
//import java.sql.SQLOutput;
import java.util.Scanner;
public class Conditional_statement {
    public static void main(String[] args){
        /*int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age ");
        age = sc.nextInt();
        if(age>=18){
            System.out.println("You are eligible to apply for license!");
        }
        else if(age>=16){
            System.out.println("You can get a learner's license");
        }
        else if(age<0){
            System.out.println("Invalid Input");
        }
        else{
            System.out.println("Sorry. You are underage, apply when you turn 18! ");
        }



        //Nested if else


        int age;
        double percentage;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        age = sc.nextInt();
        System.out.println("Enter your percentage : ");
        percentage = sc.nextDouble();
        if ( age > 18 ){
            if(percentage > 70){
                System.out.println("You are eligible to apply for admission !");
            }
            else{
                System.out.println("You are above the age of 18, but you do not satisfy the percentage criteria");
            }
        }
        else{
            System.out.println("Your age should be above 18, to apply for admission ");
        }

        //switch cases

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for validation : ");
        num = sc.nextInt();
        switch(num){
            case 1 : System.out.println("The number entered is one ");
                break;
            case 2 : System.out.println("The number entered is two ");
                break;
            case 3 : System.out.println("The number entered is three ");
                break;
            case 4 : System.out.println("The number entered is four ");
                break;
            case 5 : System.out.println("The number entered is five ");
                break;
            default : System.out.println("The number is out of range ");
                break;
        }

        //Relational Operators

        // == , != , > , < , >= , <=
        int a = 20;
        int b = 25;
        if (a == b){
            System.out.println("The numbers are equal");
        }
        else if(a > b){
            System.out.println("a is greater than b");
        }
        else if(a < b) {
            System.out.println("a is less than b");
        }

        //logical operator

        int age;
        double percentage;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        age = sc.nextInt();
        System.out.println("Enter your percentage : ");
        percentage = sc.nextDouble();

        if(age >= 18 && percentage >= 75){
            System.out.println("You are eligible for admission ");
        }
        else if (age > 18 && percentage < 75 ){
            System.out.println("You are above the age of 18 and have secured less than 75 %");
        }
        else if (age < 18 && percentage > 75){
            System.out.println("You have secured more than 75% but you are underage ");
        }
        else{
            System.out.println("You are underage and have secured less than 75 %");
        }

        //LOOPS - for, while, do while

        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number which table you would like to see");
        int num = sc.nextInt();
        i=1;
        while(i <= 10){
            System.out.println(num + " X " + i + " = " + num*i);
            i++;
        }
        for(int j = 1 ; j <=10 ; j++){
            System.out.println(num + " X " + j + " = " + num*j);
        }
        int k = 10;
        do{
            System.out.println(num + " X " + k + " = " + num*k);
            k = k - 1;
        }while(k > 0);

        //Iterative Array
        int numbers[];
        int evennum[];
        int n;
        int j=0;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want in the array ");
        n = sc.nextInt();
        numbers = new int [n];
        evennum = new int [10];
        System.out.println("Enter the " + n +  " numbers ");
        for(int i=0; i<n; i++){
            numbers[i] = sc.nextInt();
            sum = sum + numbers[i];
            if(numbers[i]%2 == 0){
                evennum[j]=numbers[i];
                j = j + 1;
            }
        }
        System.out.println("The Sum of numbers is " + sum);
        System.out.println("The even numbers are ");
        for (int k = 0; k<j; k++){
            System.out.println(evennum[k]);
        }

        //Find Odd and Even

        int numbers[];
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers do you want in an array ");
        int n = sc.nextInt();
        numbers = new int[n];
        System.out.println("Enter the numbers ==>");
        for (int i = 0; i < n; i++){
             numbers[i]=sc.nextInt();
        }
        for (int j = 0; j < n; j++){
            if(numbers[j]%2 == 0){
                System.out.println(numbers[j] + " is a EVEN number");
            }
            else{
                System.out.println(numbers[j] + " is a odd number");
            }
        }

        //Multidimensional array

        int a[][] = new int[3][3];
        int b[][] = {{1,2,3},{4,5,6},{7,8,9}};

        for (int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                System.out.print(b[i][j]);
            }
            System.out.println();
        }

        //Practice Statement 1

        int marks;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks ");
        marks = sc.nextInt();
        if(marks>=35){
            System.out.println("You PASSED");
        }
        else{
            System.out.println("You Failed");
        }

        //Practice Statement 2

        int age;
        int height;
        System.out.println("Enter your age : ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        System.out.println("Enter you height (in cm) : ");
        height = sc.nextInt();
        if(age => 16){
            if(height > 167){
                System.out.println("You are qualified to play ");
            }
            else{
                System.out.println("You are not qualified to play");
            }
        }
        else{
            System.out.println("You are not qualified as of now, come back after "+ (18-age) + " years");
        }

        //Practice Statement 3


        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number  : ");
        num = sc.nextInt();
        switch (num){
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday ");
                break;
            default :
                System.out.println("Number out of range. Please enter a number between 1 - 7");
        }

        //Practice Statement 5 (Skipped 4 because its already done!

        int ticket_price[] = {100, 150, 500, 700};
        int discounted_price[];
        discounted_price = new int [4];
        int discount;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the discount ");
        discount = sc.nextInt();
        for(int i = 0; i < ticket_price.length; i++){

            discounted_price[i] = ticket_price[i] - (ticket_price[i]*discount)/100;
        }
        System.out.println("The Discounted Prices are ==> ");
        for (int j = 0; j < discounted_price.length; j++){
            System.out.println(discounted_price[j]);
        }*/

        //Practice Statement 6

        int num;
        float result[];
        Scanner sc = new Scanner( System.in);
        System.out.println("Enter the number of values ==> ");
        num = sc.nextInt();
        result = new float[num];
        System.out.println("Now, you can enter the values ");
        for (int i = 0; i < num; i++){
            result[i] = sc.nextFloat();
        }
        System.out.println("The values which you entered are  ");
        for (int j = 0; j < num; j++){
            System.out.println(result[j]);
        }
        sc.close();
    }
}