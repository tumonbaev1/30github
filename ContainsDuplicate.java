 class ContainsDuplicate {
    public int majorityElement(int... nums) {
        int candidate = 0, count = 0;

        for (int num  : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : 0;
        }
        return candidate;
    }
    public static void main (String [] args){
        ContainsDuplicate solution = new ContainsDuplicate();
        System.out.println("Majority Element: " + solution.majorityElement(new int[]{3,2,3})); // 3
        System.out.println("Majority Element: " + solution.majorityElement(new int[]{2,2,1,1,1,2,2})); // 2
        System.out.println("Majority Element: " + solution.majorityElement(new int[]{1,1,1,2,2})); // 1
    }
}
