package Lesson10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Task1 {
    public static void main(String[] args) {

        ArrayList<String> elem = new ArrayList<>(Arrays.asList("mercury", "neptune", "venus", "earth", "mars",
                "jupiter", "earth", "mars", "saturn", "uranus", "neptune", "neptune"));


        System.out.println(countDuplicate(elem));

    }


    public static HashMap countDuplicate(ArrayList<String> list) {
        HashMap<String, Integer> controller = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            int count = 1;
            if (!controller.containsKey(list.get(i))) {
                for (int j = i + 1; j < list.size(); j++) {
                    if (list.get(i).equals(list.get(j))) {
                        count++;
                    }
                }
                if (count > 1) {
                    controller.put(list.get(i), count);
                }
            }
        }
        return controller;
    }
}

