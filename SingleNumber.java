 class SingleNumber {
     public int singleNumber(int[] nums) {
         int result = 0;
         for (int num : nums) {
             result ^= num; // XOR всех чисел
         }
         return result; // Останется только единственное число
     }

     public static void main(String[] args) {
         SingleNumber solution = new SingleNumber();

         // Тесты
         int[] nums1 = {2, 2, 1};
         System.out.println("Single number: " + solution.singleNumber(nums1)); // Ожидаемый результат: 1

         int[] nums2 = {4, 1, 2, 1, 2};
         System.out.println("Single number: " + solution.singleNumber(nums2)); // Ожидаемый результат: 4

         int[] nums3 = {1};
         System.out.println("Single number: " + solution.singleNumber(nums3)); // Ожидаемый результат: 1
     }
 }