package ControlStatment;

import java.util.Scanner;

public class SpringSeason {
    public static void main(String [] args){
        System.out.println("Enter the day:");
        Scanner sc=new Scanner(System.in);
       int day=sc.nextInt();
        System.out.println("Enter the Month:");
        int Month=sc.nextInt();
        if((Month == 3)&&((day>= 20)&&(day<=31)))
        System.out.println("March : its Spring season.");
        else if ((Month==4)&&((day>=1)&&(day<=31)))
        System.out.println("April :its Spring Season. ");
        else if((Month==5)&&((day>=1)&&(day<=31)))
        System.out.println("May :its Spring Season. ");
        else if ((Month==6)&&((day>=1)&&(day<=31)))
        System.out.println("June :its Spring Season. ");
        else
        System.out.println("Not Spring Season.");
    }
}
