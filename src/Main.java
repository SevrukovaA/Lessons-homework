import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Number of students:  ");
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int numRatings = sc.nextInt();


        int[] grade;
        grade = new int[numRatings];


        // заполнение массива
        for (int i = 0; i < grade.length; i++) {
            int tempDays = (int) ((Math.random() * (10 + 1)));
            grade[i] = tempDays;

            System.out.print(grade[i]);
            System.out.print(" ;");
        }

        System.out.println();

        // вывод отсортированного массива
        int[] sortGrade = bubbleSort(grade);
        for (int j : sortGrade) {

            System.out.print(j);
            System.out.print(" ;");

        }
        System.out.println();

        //Проверка на наличие отставания минимального значения
        if (sortGrade[1] > sortGrade[0] + 3) {
            for (int a = 1; a < sortGrade.length; a++) {
                sum += sortGrade[a];
            }
            sortGrade[0] = sum / (sortGrade.length - 1);

            //вивод массива с заменой минимального значения
            for (int i : sortGrade) {

                System.out.print(i);
                System.out.print(" ;");
            }

        } else {
            System.out.println("The group is doing well");
        }


    }

    //метод для сортировки массива
    public static int[] bubbleSort(int[] array) {
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        return array;
    }
}



