class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> store = new HashSet<>();
        int left=0;
        int right=0;
        int result=0;
        char[] ch = s.toCharArray();
        while(right<s.length()){
            char ch1 = ch[right];
            if(!store.contains(ch1)){
                store.add(ch1);
                right++;
            }else {
                while(store.contains(ch1)){
                    store.remove(ch[left]);
                    left++;
                }
            }
            result = Math.max(result, right-left);
        }
        return result;
    }
}
