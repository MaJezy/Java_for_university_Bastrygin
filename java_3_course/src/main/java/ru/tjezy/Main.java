package ru.tjezy;


import java.util.*;



public class Main {

    public static void main(String[] args) {

        System.out.println("1. Функции: \n");

        /*FizzBuzz(500); */
        System.out.println(MakeInstall("make install"));
        System.out.println(QuadraticRoots(1, -3, 2));
        System.out.println(Sum(0.0, 2));
        System.out.println(Palindrome("level"));
        
        System.out.println("\n2. ООП: \n");

        /* Кнопка с подсчетом нажатий */
        System.out.println("2.1:");
        Button button = new Button();
        button.click();
        button.click();

        /* Баланс */
        System.out.println("\n2.2:");
        Balance balance = new Balance();
        balance.addLeft(5);
        balance.addRight(3);
        balance.result();

        /* Колокольчик */
        System.out.println("2.3:");
        Bell bell = new Bell();
        bell.sound();
        bell.sound();
        bell.sound();

        /* OddEvenSeparator */
        System.out.println("\n2.4:");
        OddEvenSeparator OES = new OddEvenSeparator();
        OES.addNumber(2);
        OES.addNumber(5);
        OES.addNumber(7);
        OES.addNumber(6);
        System.out.println(OES.even());
        System.out.println(OES.odd());

        System.out.println("\n");

        /* Table */
        System.out.println("2.5:");
        Table table = new Table(3, 3); // 3x3 таблица
        table.setValue(0, 0, 5);
        table.setValue(0, 1, 7);
        table.setValue(1, 1, 12);
        table.setValue(2, 2, 18);

        System.out.println("Таблица:");
        System.out.println(table.toString());

        System.out.println("Среднее значение: " + table.average());
        System.out.println("Строк: " + table.rows() + ", Столбцов: " + table.cols());


        /* Коллекции */
                // Задание 1: Collections
        System.out.println("\nКоллекции:\n");
        CollectionsDemo.run();

        // Задание 2: PrimesGenerator
        

        // Задание 3: Класс Human и компараторы
        System.out.println("\n" + "═");
        System.out.println("ЗАДАНИЕ 9: HUMAN И КОЛЛЕКЦИИ");
        System.out.println("═");

        HumanCollectionsDemo.demo();
    }


    public static void FizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Fizz");
            } else if (i % 7 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

    }


    public static String MakeInstall(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return("Перевернутая строка: " + reversed);
    }

    /* Квадратный корень */
    public static String QuadraticRoots(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;

        if (discriminant < 0) {
            return("нет вещественных корней");
        } else {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            return("Корни: " + x1 + " и " + x2);
        }
    }

    /* Сумма ряда */
    public static String Sum(double sum, int n) {
        while (true) {
            double term = 1.0 / (n * n + n - 2);
            if (term < 1e-6) break;
            sum += term;
            n++;
        }
        return("Сумма ряда: " + sum);
    }

    /* Палиндром */
    public static String Palindrome(String str) {
        boolean isPalindrome = true;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        return(isPalindrome ? str + " - палиндром" : str + " - не палиндром");
    }

    

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

