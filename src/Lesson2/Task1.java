package Lesson2;

import java.util.Scanner;

/**
 * Простая (2 балла)
 * <p>
 * Определить, четное ли данное число
 */

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Enter the number:   ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a % 2 != 0) {
            System.out.println("Your number is not even");
        } else {
            System.out.println("Your number is even");
        }
    }
}
