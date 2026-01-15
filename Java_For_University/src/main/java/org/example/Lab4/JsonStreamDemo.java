package org.example.Lab4;

import java.io.IOException;

public class JsonStreamDemo {
    public static void demo() {
        System.out.println("STREAM API & JSON     ");

        try {
            LibraryService service = new LibraryService();
            service.executeAllTasks();
        } catch (IOException e) {
            System.err.println("\n❌ ОШИБКА: " + e.getMessage());
            System.out.println("\n💡 Убедитесь, что файл books.json находится в правильной папке.");
        } catch (Exception e) {
            System.err.println("\n❌ ОШИБКА ПРИ ВЫПОЛНЕНИИ: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
