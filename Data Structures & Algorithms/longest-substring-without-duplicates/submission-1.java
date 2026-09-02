class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        Set<Character> store = new HashSet<>();
        char[] char1= s.toCharArray();
        int left=0;
        int right=0;
        int result=0;
        while(right<s.length()){
            if(!store.contains(char1[right])){
                store.add(char1[right]);
                right++;
                result = Math.max(result, store.size());
            }else{
                store.remove(char1[left]);
                left++;
            }
        }
        return result;
    }
}