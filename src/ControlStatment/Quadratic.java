package ControlStatment;

import java.util.Scanner;

public class Quadratic {
    public static void main(String [] args){
        double a,b,c,root1, root2,delta;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value for a:");
        a=sc.nextInt();
        System.out.println("Enter the value for b:");
        b=sc.nextInt();
        System.out.println("Enter the value for c:");
        c=sc.nextInt();

        delta=b*b -4*a*c;
        root1 = (-b + Math.sqrt(delta))/(2*a);

        root2 = (-b - Math.sqrt(delta))/(2*a);
        System.out.println("first root of Quadratic equation is:Root1->"+root1);
        System.out.println("second root of Quadratic equation is:Root2->"+root2);
    }
}
