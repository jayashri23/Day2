package ControlStatment;

public class ForPalindrom {
    public static void main(String[] args) {
        int a,reminder, reverse = 0;
        int inputNumber = 121;
        a = inputNumber;
        for (;a != 0; a /= 10)
        {
            reminder = a % 10;
            reverse = reverse* 10 + reminder;
            a = a / 10;
        }
        if (reverse == inputNumber)
        {
            System.out.println("Number is Palindrom");
        } else
            System.out.println(" Number is not Palindrom");
    }
}
