public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        // Отрицательные числа не могут быть палиндромами
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;
        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }

        // Число палиндром, если левая и правая часть равны
        return x == reversedHalf || x == reversedHalf / 10;
    }

    public static void main(String[] args) {
        int[] testCases = {121, -121, 10, 12321, 0, 1221, 1001, 1234321};

        for (int num : testCases) {
            System.out.println("Is " + num + " a palindrome? " + isPalindrome(num));
        }
    }
}
