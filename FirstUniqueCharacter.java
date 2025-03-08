import java.util.HashMap;

public class FirstUniqueCharacter {
    public static int firstUniqChar(String s) {
        // Создаём HashMap для подсчёта частот символов
        HashMap<Character, Integer> freq = new HashMap<>();

        // Подсчитываем частоту каждого символа в строке
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        // Ищем первый символ с частотой 1
        for (int i = 0; i < s.length(); i++) {
            if (freq.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        // Если уникальных символов нет, возвращаем -1
        return -1;
    }

    public static void main(String[] args) {
        // Примеры использования
        System.out.println(firstUniqChar("leetcode"));       // Output: 0
        System.out.println(firstUniqChar("loveleetcode"));  // Output: 2
        System.out.println(firstUniqChar("aabb"));           // Output: -1
    }
}
