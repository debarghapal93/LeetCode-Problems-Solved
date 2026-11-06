class Solution {
    public String majorityFrequencyGroup(String s) {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        int[] group = new int[s.length() + 1];
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                group[freq[i]]++;
            }
        }
        int maxSize = 0, maxFreq = 0;
        for (int k = 1; k <= s.length(); k++) {
            if (group[k] > maxSize || (group[k] == maxSize && k > maxFreq)) {
                maxSize = group[k];
                maxFreq = k;
            }
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (freq[i] == maxFreq) {
                ans.append((char) ('a' + i));
            }
        }
        return ans.toString();
    }
}