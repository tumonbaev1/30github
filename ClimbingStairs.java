 class ClimbingStairs {
    public int climbStairs(int n ) {
        if (n == 1) return 1;
        if (n == 2) return 2;

        int prev1 = 1;
        int prev2 = 2;
        int current = 0;

        for (int i = 3; i <= n; i++) {
            current = prev1 + prev2;
            prev1 = prev2;
            prev2 = current;
        }
        return current;
    }
    public static void main (String[] args){
        ClimbingStairs solution = new ClimbingStairs();

        System.out.println("Ways to climb 2 stairs: " + solution.climbStairs(2)); // 2
        System.out.println("Ways to climb 3 stairs: " + solution.climbStairs(3)); // 2
        System.out.println("Ways to climb 5 stairs: " + solution.climbStairs(5)); // 2
        System.out.println("Ways to climb 10 stairs: " + solution.climbStairs(10)); // 2
    }
}
