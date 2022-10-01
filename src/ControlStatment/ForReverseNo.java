package ControlStatment;

import java.util.Scanner;

public class ForReverseNo {
    public static void main(String[] args){


        int i,reverse=0,reminder;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number :");
        i=sc.nextInt();

        for( ;i!=0;i=i/10 )
        {
            reminder= i%10;
            reverse=reverse*10+reminder;

        }
        System.out.println("Reverse of the Number:"+reverse);
    }
}
