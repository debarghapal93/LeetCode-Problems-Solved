class Solution {
    public int climbStairs(int n) {
        if (n < 4) return n;
        int first = 2, second = 3;
        for (int i = 4; i <= n; i++){
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }
}