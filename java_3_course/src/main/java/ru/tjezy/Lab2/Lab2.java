package ru.tjezy.Lab2;

import java.util.ArrayList;
import java.util.List;

public class Lab2 {
       /* ООП */
    /* Кнопка с подсчетом нажатий */
    public static class Button {
    private int clicks = 0;

    public void click() {
        clicks++;
        System.out.println("Количество нажатий кнопки: " + clicks);
    }
}

    /* Баланс */
    public static class Balance {
    private int left = 0;
    private int right = 0;

    public void addLeft(int weight) {
        left += weight;
    }

    public void addRight(int weight) {
        right += weight;
    }

    public void result() {
        if (left == right) {
            System.out.println("\nБаланс уравнен\n");
        } else if (right > left) {
            System.out.println("\nБаланс уходит в сторону: R\n");
        } else {
            System.out.println("\nБаланс уходит в сторону: L\n");
        }
    }

    
}   /* Колокольчик */
    public static class Bell {
    private boolean dingNext = true;

    public void sound() {
        if (dingNext) {
            System.out.println("ding");
        } else {
            System.out.println("dong");
        }
        dingNext = !dingNext;
    }


}   /* OddEvenSeparator */
    public static class OddEvenSeparator {
    private List<Integer> evens = new ArrayList<>();
    private List<Integer> odds = new ArrayList<>();

    public void addNumber(int number) {
        if (number % 2 == 0) {
            evens.add(number);
        } else {
            odds.add(number);
        }
    }

    public String even() {
        return("Чётные: " + evens);
    }

    public String odd() {
        return("Нечётные: " + odds);
    }
}

    /* Table */
    public static class Table {
    private int[][] data;

    public Table(int rows, int cols) {
        data = new int[rows][cols];
    }

    public int getValue(int row, int col) {
        return data[row][col];
    }

    public void setValue(int row, int col, int value) {
        data[row][col] = value;
    }

    public int rows() {
        return data.length;
    }

    public int cols() {
        return data[0].length;
    }

    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int[] row : data) {
            for (int val : row) {
                sb.append(val).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public double average() {
        double sum = 0;
        int count = 0;
        for (int[] row : data) {
            for (int val : row) {
                sum += val;
                count++;
            }
        }
        return sum / count;
    }
}
}
