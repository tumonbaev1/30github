import java.util.Scanner;

public class MaximumSubarray {
    // Метод для нахождения максимальной суммы подмассива (Алгоритм Кадане)
    public static int maxSubArray(int[] nums) {
        int currentSum = nums[0]; // Начинаем с первого элемента
        int maxSum = nums[0]; // Изначально максимум = первый элемент

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]); // Выбираем, продолжать подмассив или начать новый
            maxSum = Math.max(maxSum, currentSum); // Обновляем максимум
        }

        return maxSum; // Возвращаем максимальную сумму подмассива
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод массива
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 5; i < n; i++) {
            nums[i] = scanner.nextInt(); // Считываем массив
        }

        // Вызываем метод и выводим результат
        int result = maxSubArray(nums);
        System.out.println("Maximum Subarray Sum: " + result);

        scanner.close();
    }
}
