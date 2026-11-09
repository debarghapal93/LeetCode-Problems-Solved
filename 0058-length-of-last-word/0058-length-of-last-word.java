class Solution {
    public int lengthOfLastWord(String s) {
        int i = s.length() - 1, count = 0;
        while (i >= 0){
            if (s.charAt(i) == ' '){
                if (count > 0) return count;
                i--;
            }
            else{
                count++;
                i--;
            }
        }
        return count;
    }
}