public class SumOfTwoIntegers {
    public  int getSum(int a, int b) {
        while (b != 0) {
            int carry = (a & b) << 1; // Находим перенос
            a = a ^ b; // Сложение без переноса
            b = carry; // Обновляем b (перенос)
        }
        return a;
    }

    // 🔹 Метод main() для тестов
    public static void main(String[] args) {
        SumOfTwoIntegers solution = new SumOfTwoIntegers();

        // ✅ Тесты
        System.out.println("Sum: " + solution.getSum(1, 2)); // 3
        System.out.println("Sum: " + solution.getSum(2, 3)); // 5
        System.out.println("Sum: " + solution.getSum(-5, 7)); // 2
        System.out.println("Sum: " + solution.getSum(-10, -20)); // -30
    }
}

