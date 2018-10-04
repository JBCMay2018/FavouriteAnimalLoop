package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String animal ="";
        int age;
        String response="yes";

        do{
            System.out.println("What is your favourite animal?");
            animal=sc.nextLine();

            System.out.println("What is the age of your animal?");
            age=sc.nextInt();
            sc.nextLine();

            if(age%2==0)
            {
                System.out.println(animal+" will be an odd age next year");
            }else
            {
                System.out.println(animal + " is odd");
            }
            System.out.println("Enter no to stop or anything else to continue");
            response=sc.nextLine();



        }while(!response.equalsIgnoreCase("no"));
    }
}
