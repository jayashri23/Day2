package ControlStatment;

import java.util.Scanner;

public class WhileRevers {

    public static void main(String[] args) {
        int i, reverse = 0, reminder;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        i = sc.nextInt();
        while (i != 0) {
            reminder = i % 10;
            reverse = reverse * 10 + reminder;
            i=i/10;
        }
        System.out.println("The reverse number of given number is:" + reverse);
    }
}
