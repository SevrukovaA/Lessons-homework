package Lesson2;

import java.util.Scanner;

/**
 * Тривиальная (3 балла).
 * <p>
 * Задача имеет повышенную стоимость как первая в списке.
 * <p>
 * Пользователь задает время в часах, минутах и секундах, например, 8:20:35.
 * Рассчитать время в секундах, прошедшее с начала суток (30035 в данном случае).
 */

public class Task3 {
    public static void main(String[] args) {
        System.out.print("Enter the date in the format: HH:MM:SS \n");
        Scanner inp = new Scanner(System.in);
        String str = inp.nextLine();
        String[] arr;


        // Проверка формата
        if (str.matches("\\d:\\d\\d:\\d\\d")) {
            arr = str.split(":");
            int h = Integer.parseInt(arr[0]);
            int m = Integer.parseInt(arr[1]);
            int s = Integer.parseInt(arr[2]);

            long sec = ((h * 60) * 60) + (m * 60) + s;
            System.out.println("Your time in seconds: " + sec);

        } else {
            System.out.println("Invalid date format");
        }
    }

}
