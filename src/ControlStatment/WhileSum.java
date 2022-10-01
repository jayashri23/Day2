package ControlStatment;

import java.util.Scanner;

public class WhileSum {
    public static void main(String [] args){
        int sum=0,num=0,i;
        Scanner sc =new Scanner(System.in);
        System.out.println("sum from:");
        i=sc.nextInt();
        System.out.println("sum up to:");
        num=sc.nextInt();
        while(i<=num)
        {
            sum = sum + num;
            i++;
        }
        System.out.println("Sum of natural number is:"+sum);

    }
}
