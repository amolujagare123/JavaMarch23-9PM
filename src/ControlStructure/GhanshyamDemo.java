package ControlStructure;

import java.util.Scanner;

public class GhanshyamDemo {

    public static void main(String[] args) {
        int marks=0;
        Scanner ghan=new Scanner(System.in);

        System.out.print("Enter marks: ");
        marks=ghan.nextInt();

        if (marks<33) {
            System.out.println("Failed");
        }
        if (marks>=33 && marks<40){
            System.out.println("Pass");
        }
        if (marks>=40 && marks<55) {
            System.out.println("3rd Division");
        }
        if (marks>=55 && marks<65) {
            System.out.println("2nd Division");
        }
        if (marks>=65 && marks<75) {
            System.out.println("1st Division");
        }
        if (marks>=75) {
            System.out.println("Distinction");
        }
        // TODO Auto-generated method stub

    }
}
