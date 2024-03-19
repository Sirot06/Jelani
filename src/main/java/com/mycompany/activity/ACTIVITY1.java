
package com.mycompany.activity;

import java.util.Scanner;


public class ACTIVITY1 {

  
    public static void main(String[] args) {
             
        Scanner scn = new Scanner(System.in);
        String lName, fName, mInitial, Gender;
        int age, month, day, year;
        
        
        System.out.println("Enter Your Last Name:");
        lName = scn.nextLine();
        
        System.out.println("Enter your First Name:");
        fName = scn.nextLine();
        
        System.out.println("Enter your Middle Initial:");
        mInitial = scn.nextLine();
        
        System.out.println("Enter your Gender:");
        Gender = scn.nextLine();
        
        System.out.println("Enter your age:");
        age = scn.nextInt();
       
        System.out.println("Enter the month of your birthday:");
        month = scn.nextInt();
        
        System.out.println("Enter the day of your birthday:");
        day = scn.nextInt();
        
        System.out.println("Enter the year of your birthday:");
        year = scn.nextInt();
        
        System.out.println("Name: " + lName + "," +fName +" "+ mInitial + "\n" +
                "Age: " + age  +"\n"+ "Gender: " + Gender + "\n" + "Birtdate: "+
                month + "/" + day + "/" + year);
        
        scn.close();
    }
}
    



