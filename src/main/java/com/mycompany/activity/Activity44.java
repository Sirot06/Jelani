package com.mycompany.activity;


public class Activity44 {

    
    public static void main(String[] args) {
        int entranceScore = 90;
        double gpa = 3.5;

        if (entranceScore >= 75 && gpa >= 3.0) {
            System.out.println("The student is eligible for admission.");
            System.out.println("Entrance score: " + entranceScore);
            System.out.println("GPA: " + gpa);
        } else {
            System.out.println("The student is not eligible for admission.");
        }
    }
}
    
