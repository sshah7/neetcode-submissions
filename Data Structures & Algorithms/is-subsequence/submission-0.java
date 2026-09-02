class Solution {
    public boolean isSubsequence(String s, String t) {
        int left = 0;
        int right = 0;

        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();

        while(left < charS.length && right < charT.length){
            if(charS[left] == charT[right]){
                left++;
                right++;
            }else {
                right++;
            }
        }
        return left == charS.length ? true : false;
    }
}