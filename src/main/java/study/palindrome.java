package study;

import java.util.Scanner;

import static java.lang.System.in;

public class palindrome {
    public static void main(String[] args) {
        String original, reverse="";
        Scanner sc = new Scanner(in);
        original = sc.nextLine();
        System.out.println(original);
        int length = original.length();
        System.out.println(length);
        for (int i =length-1; i>=0;i--)
        {
            reverse = reverse+original.charAt(i);
            if(original.equals(reverse))
            {
                System.out.println("Entered is palindraome");
            }
            else {
                System.out.println("Entered is Not a palindraome");
            }
        }


    }
}
