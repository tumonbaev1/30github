class MissingNumber {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] count = new int[26];
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
        MissingNumber solution = new MissingNumber();
            System.out.println("\"anagram\" vs \"nagaram\": " + solution.isAnagram("anagram", "nagaram")); // true
            System.out.println("\"rat\" vs \"car\": " + solution.isAnagram("rat", "car")); // false
            System.out.println("\"listen\" vs \"silent\": " + solution.isAnagram("listen", "silent")); // true
            System.out.println("\"hello\" vs \"olelh\": " + solution.isAnagram("hello", "olelh")); // true
            System.out.println("\"a\" vs \"b\": " + solution.isAnagram("a", "b")); // false
        }
}
