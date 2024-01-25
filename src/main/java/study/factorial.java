package study;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(x);
        int a = 1;
        for (int i = x; i > 0; i--) {
            a *= i;

        }
        System.out.println(a);
    }

}
