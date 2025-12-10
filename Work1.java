public class Work1 {

    public static void main(String[] args) {

        System.out.println("1. Функции: \n");

        /*FizzBuzz(500); */
        System.out.println(MakeInstall("make install"));
        System.out.println(QuadraticRoots(1, -3, 2));
        System.out.println(Sum(0.0, 2));
        System.out.println(Palindrome("level"));
        
        System.out.println("\n2. ООП: \n");

        /* ООП, кнопка */
        Button button = new Button();
        button.click();
        button.click();

        /* Баланс */
        Balance balance = new Balance();
        balance.addLeft(5);
        balance.addRight(3);
        balance.result();

        /* Колокольчик */
        Bell bell = new Bell();
        bell.sound();
        bell.sound();
        bell.sound();
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

    

    /* ООП: Кнопка с подсчетом нажатий */
    public static class Button {
    private int clicks = 0;

    public void click() {
        clicks++;
        System.out.println("Количество нажатий: " + clicks);
    }
}

    /* ООП: Баланс */
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
            System.out.println("Баланс уравнен");
        } else if (right > left) {
            System.out.println("Баланс уходит в сторону: R");
        } else {
            System.out.println("Баланс уходит в сторону: L");
        }
    }

    /* ООП: Колокольчик */


}
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
}

}




