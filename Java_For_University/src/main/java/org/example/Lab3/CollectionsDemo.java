package org.example.Lab3;

import java.util.*;

public class CollectionsDemo {
    public static void run() {
        int N = 10;
        Random rand = new Random();
        Integer[] arr = new Integer[N];
        for (int i = 0; i < N; i++) arr[i] = rand.nextInt(101);

        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println("Исходный список: " + list);

        Collections.sort(list);
        System.out.println("По возрастанию: " + list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("По убыванию: " + list);

        Collections.shuffle(list);
        System.out.println("Перемешанный: " + list);

        Collections.rotate(list, 1);
        System.out.println("Сдвиг: " + list);
    }
}
