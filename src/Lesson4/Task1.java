package Lesson4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        /*
          есть сервис, который дает информацию о погоде на каждый день месяца.
           Нужно найти среднюю температуру за месяц. Входные данные:
           программа должна работать с массивами размерностей 28 - 31
         */


        System.out.println(" Enter number of days: ");
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int arrSize = sc.nextInt();

        System.out.print("Temperature this month: ");

        int[] days;
        days = new int[arrSize];


        // заполнение массива случайними температурами от-20 до +40
        for (int i = 0; i < days.length; i++) {
            int tempDays = (int) ((Math.random() * (40 + 20 + 1) - 20));
            days[i] = tempDays;

            System.out.print(days[i]);
            System.out.print(" ;");
        }
        System.out.println();


        // определение средней температури за месяц
        for (int i = 0; i < days.length; i++) {
            sum += days[i];
        }
        System.out.println("Average temperature this month: " + sum / days.length);
    }
}
