class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int right = 0;
        int maxLen = 0;
        int[] counts = new int[26];
        int maxFreq = 0;

        while (right < s.length()) {
            counts[s.charAt(right) - 'A']++;
            maxFreq = Math.max(maxFreq, counts[s.charAt(right) - 'A']);

            if ((right - left + 1) - maxFreq > k) {
                counts[s.charAt(left) - 'A']--;
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }
        return maxLen;
    }
}