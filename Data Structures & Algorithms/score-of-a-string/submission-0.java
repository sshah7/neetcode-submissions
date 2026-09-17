class Solution {
    public int scoreOfString(String s) {
        int sum=0;

        for(int i=1; i<s.length(); i++){
            int prevChar = s.charAt(i-1) - 'a';
            int currChar = s.charAt(i) - 'a';
            sum += Math.abs(prevChar - currChar);
        }

        return sum;
    }
}