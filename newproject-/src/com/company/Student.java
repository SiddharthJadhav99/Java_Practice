package com.company;

public class Student {

    //First lets understand with only variables


    /*int student_id;
    int marks;/*

    // Now lets understand with variables and functions


    /*int student_id;
    int phy;
    int chem;
    int math;

    void percentage(){
        System.out.println("Percentage = " + (phy+chem+math)/3);
    }*/



    //Now lets understand the classes with return types.



    /*int id;
    int phy;
    int chem;
    int math;
    double percentage(){
        double per;
        per = (phy+chem+math)/3;
        return per;
    }*/



    //Now lets make a function which takes paramenters



    /*int phy;
    int chem;
    int math;

    double percentage(int sum) {
        return (sum/3);
    }
    int total(){
        return phy+chem+math;
    }*/



    //Using CONSTRUCTOR



    /*int id;
    int phy;
    int chem;
    int math;
    Student(){
        id = 1;
        System.out.println("Constructor is being executed ");
    }*/



    //Using Parametrised Constructor



    int id;
    int phy;
    int chem;
    int maths;
    Student(int i, int p, int c, int m ){
        id = i;
        phy = p;
        chem = c;
        maths = m;
    }


}

