package ru.tjezy.Lab1;

public class Lab1 {
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
}
