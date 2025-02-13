import java.util.Scanner; // Импортируем Scanner для ввода данных

public class Greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Создаём объект Scanner
        System.out.print("Введите ваше имя: ");  // Просим пользователя ввести имя
        String name = scanner.nextLine();        // Считываем введённое имя
        System.out.println("Привет, " + name + "!"); // Выводим приветствие
        scanner.close(); // Закрываем Scanner
    }
}

