class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] char1 = s.toCharArray();
        Set<Character> store = new HashSet<>();
        int left=0;
        int right= 0;
        int maxCount=0;
        while(right < char1.length){
            if(!store.contains(char1[right])){
                store.add(char1[right]);
                right++;
                maxCount = Math.max(maxCount, store.size());
            }else{
                store.remove(char1[left]);
                left++;
            }
        }
        return maxCount;
    }
}