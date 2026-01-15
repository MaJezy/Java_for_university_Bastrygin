package org.example;

import static  org.example.Lab1.Lab1.*;

import static  org.example.Lab2.Lab2.*;

import  org.example.Lab3.*;

import  org.example.Lab4.*;

import  org.example.Lab5.*;

import javafx.application.Application;
import org.example.Lab5.WordShifter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Выберите тему:");
        System.out.println("1: Функции");
        System.out.println("2: ООП");
        System.out.println("3: Коллекции");
        System.out.println("4: StreamAPI");
        System.out.println("5: JavaFX");

        System.out.print("Ваш выбор: ");

        int topic = sc.nextInt();
        System.out.println();

        switch (topic) {

            /* ===================== 1. ФУНКЦИИ ===================== */
            case 1:
                System.out.println("1. Функции: \n");

                /*FizzBuzz(500); */
                System.out.println(MakeInstall("make install"));
                System.out.println(QuadraticRoots(1, -3, 2));
                System.out.println(Sum(0.0, 2));
                System.out.println(Palindrome("level"));
                break;

            /* ===================== 2. ООП ===================== */
            case 2:
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
                break;

            /* ===================== 3. КОЛЛЕКЦИИ ===================== */
            case 3:
                System.out.println("\nКоллекции:\n");

                // Задание 1: Collections
                CollectionsDemo.run();

                // Задание 3: Класс Human и компараторы
                System.out.println("\n" + "═");
                System.out.println("HUMAN И КОЛЛЕКЦИИ");

                HumanCollectionsDemo.demo();
                break;


            case 4:
                System.out.println("StreamAPI");
                JsonStreamDemo.demo();
                break;



            case 5:
                System.out.println("JavaFX");
                Application.launch(WordShifter.class, args);


            default:
                System.out.println("Неверный пункт меню");
        }

        sc.close();
    }
}
