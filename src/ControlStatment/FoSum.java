package ControlStatment;

import java.util.Scanner;

public class FoSum {
    public static void main(String[] args){
        int i,n,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Sum from");
        i=sc.nextInt();
        System.out.println("Sum up to:");
        n=sc.nextInt();
        for (i=1;i<=n;i++) {
            sum = sum + i;
        }
        System.out.println("Sum the numbers is :" +sum);
    }

}
