class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        int i = 0, j = 0;
        while (i < nums.length){
            if (j < nums.length){
                if (nums[i] + nums[j] == target && i != j){
                    ans[0] = i;
                    ans[1] = j;
                    break;
                }
                else j++;
            }
            else{
                i++;
                j = 0;
            }
        }
        return ans;
    }
}