class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        Set<Character> store = new HashSet<>();

        int left=0;
        int right=0;
        int maxLen = 0;
        while(right < s.length()){
            if(!store.contains(s.charAt(right))){
                store.add(s.charAt(right));
                right++;
                maxLen = Math.max(maxLen, store.size());
            }else{
                while(store.contains(s.charAt(right))){
                    store.remove(s.charAt(left));
                    left++;
                }
                store.add(s.charAt(right));
                right++;
            }
        }
        return maxLen;
    }
}
