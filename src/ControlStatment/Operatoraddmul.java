package ControlStatment;

import java.util.Scanner;

public class Operatoraddmul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, add, multi, x, y, z, w;
        System.out.println("Enter three numbers:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        float division;
        x = a + b * c;
        y = c + (a / b);
        z = a % (b + c);
        w = a * (b + c);
        if (x > y && x > z && x > w) {
            System.out.println("X operator is Max:" + x);
        } else if (y > x && y > w && y > z) {
            System.out.println("X operator is Max:" + y);
        } else if (z > x && z > w && z > y) {
            System.out.println("X operator is Max:" + z);
        } else if (w > x && w > z && w > y) ;
        {
            System.out.println("X operator is Max:" + w);
        }
    }
}
