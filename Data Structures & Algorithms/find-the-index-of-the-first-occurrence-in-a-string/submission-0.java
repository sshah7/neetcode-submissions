class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() > haystack.length()) return -1;
        int count=1;
        for(int i=0; i<=haystack.length()-needle.length(); i++){
            for(int j=0; j<=needle.length()-1; j++){
                if(haystack.charAt(i+j) != needle.charAt(j)){
                    break;
                }else if(j == needle.length() - 1){
                    return i;
                }
            }
        }
        return -1;
    }
}