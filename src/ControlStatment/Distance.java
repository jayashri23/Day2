package ControlStatment;

import java.util.Scanner;

public class Distance {
    public static void main(String [] args){
        double x,y,distance;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Euclidean distance from x:");
        x=sc.nextInt();
        System.out.println("Enter the Euclidean distance from y:");
        y=sc.nextInt();
        distance=Math.sqrt((x*x)+(y*y));
        System.out.println("Calculated distance:" +distance);
    }

    }

