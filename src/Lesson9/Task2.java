package Lesson9;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        System.out.print("Please enter the date in the format DD.MM.YYYY: \n");
        Scanner inp = new Scanner(System.in);
        String str = inp.nextLine();
        String[] arr;


        // Проверка формата
        if (str.matches("\\d\\d\\.\\w*\\.\\d\\d\\d\\d")) {

            arr = str.split("\\.");
            int day = Integer.parseInt(arr[0]);
            String month = String.valueOf(arr[1]);
            int year = Integer.parseInt(arr[2]);

            String[] monthName = new String[]{"January", "March", "May", "July", "August",
                    "October", "December", "April", "June", "September", "November", "February"};
            String[] monthNumber = new String[]{"01", "03", "05", "07", "08", "10", "12", "04", "06", "09", "11", "02"};

            for (int i = 0; i <= 6; i++) {
                if (monthName[i].equalsIgnoreCase(arr[1]) && day <= 31) {
                    System.out.println(day + "." + monthNumber[i] + "." + year);
                }
            }
            if (day > 31) {
                System.out.println("this month has 31 days");
            }
            for (int y = 7; y <= 10; y++) {
                if (monthName[y].equalsIgnoreCase(arr[1]) && day <= 30) {
                    System.out.println(day + "." + monthNumber[y] + "." + year);
                }
            }
            if (day > 30) {
                System.out.println("this month has 30 days");
            }
            if (monthName[11].equalsIgnoreCase(arr[1]) && day <= 28) {
                System.out.println(day + "." + monthNumber[11] + "." + year);
            }
            if (day > 28) {
                System.out.println("this month has 28 days");
            }
        } else {
            System.out.println("Invalid date format");
        }
    }
}

