public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        // 1️⃣ Если длины разные, сразу false
        if (s.length() != t.length()) return false;

        // 2️⃣ Создаём массив для подсчёта символов (26 букв)
        int[] count = new int[26];

        // 3️⃣ Подсчитываем буквы в s и t
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int num : count) {
            if (num != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
       ValidAnagram solution = new ValidAnagram();

        System.out.println("\"anagram\" vs \"nagaram\": " + solution.isAnagram("anagram", "nagaram")); // true
        System.out.println("\"rat\" vs \"car\": " + solution.isAnagram("rat", "car")); // false
        System.out.println("\"listen\" vs \"silent\": " + solution.isAnagram("listen", "silent")); // true
        System.out.println("\"hello\" vs \"olelh\": " + solution.isAnagram("hello", "olelh")); // true
        System.out.println("\"a\" vs \"b\": " + solution.isAnagram("a", "b")); // false
    }
}


