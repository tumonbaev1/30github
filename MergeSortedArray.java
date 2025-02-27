import java.util.Arrays;
class MergeSortedArray {
    public  void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;      // Указатель на конец чисел в nums1
        int j = n - 1;      // Указатель на конец nums2
        int k = m + n - 1;  // Указатель на конец nums1

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        // Если остались элементы в nums2, копируем их в nums1
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
    public static void main(String[] args) {
        MergeSortedArray solution = new MergeSortedArray();

        // ✅ Тест 1
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        solution.merge(nums1, m, nums2, n);
        System.out.println("Merged array: " + Arrays.toString(nums1)); // Ожидаемый результат: [1,2,2,3,5,6]

        // ✅ Тест 2
        int[] nums1_2 = {1};
        int m2 = 1;
        int[] nums2_2 = {};
        int n2 = 0;
        solution.merge(nums1_2, m2, nums2_2, n2);
        System.out.println("Merged array: " + Arrays.toString(nums1_2)); // Ожидаемый результат: [1]

        // ✅ Тест 3
        int[] nums1_3 = {0};
        int m3 = 0;
        int[] nums2_3 = {1};
        int n3 = 1;
        solution.merge(nums1_3, m3, nums2_3, n3);
        System.out.println("Merged array: " + Arrays.toString(nums1_3)); // Ожидаемый результат: [1]
    }
}


