class Solution {
    public boolean isPalindrome(String s) {
        String str1 = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int left=0;
        int right=str1.length()-1;

        while(left<right){
            if(str1.charAt(left)!= str1.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
