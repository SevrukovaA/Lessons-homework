package Lesson2;

import java.util.Scanner;

/**
 * Простая (2 балла)
 * <p>
 * Пользователь задает целое трехзначное число (например, 478).
 * Необходимо вывести число, полученное из заданного перестановкой цифр в обратном порядке (например, 874).
 */

public class Task2 {
    public static void main(String[] args) {
        System.out.print("Please enter a three-digit number: \n");
        Scanner inp = new Scanner(System.in);
        String str = inp.nextLine();
        String[] arr;


        // Проверка формата
        if (str.matches("\\d\\d\\d")) {
            arr = str.split("");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            int s = Integer.parseInt(arr[2]);


            System.out.println("Your number in mirror image: " + s + b + a);

        } else {
            System.out.println("Invalid date format");
        }
    }

}
