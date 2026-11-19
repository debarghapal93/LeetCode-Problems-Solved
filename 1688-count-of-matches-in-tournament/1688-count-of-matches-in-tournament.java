class Solution {
    public int numberOfMatches(int n) {
        int ans = 0;
        while (n > 1){
            int i = n / 2;
            ans += i;
            n -= i;
        }
        return ans;
    }
}