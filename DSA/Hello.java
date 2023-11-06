package DSA;

import java.util.Scanner;

/**
 * hello
 */
public class Hello {

    public static void main(String[] args) {
        System.out.println("Enter an intiger to print");

        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println("hey"+a);
        sc.close();
    }
}