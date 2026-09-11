class Solution {
    public String stringShift(String s, int[][] shift) {
        char[] charArray = s.toCharArray();
        int amt=0;
        for(int i=0; i<shift.length; i++){
            if(shift[i][0] == 0){
                amt+=shift[i][1];
            }else{
                amt-=shift[i][1];
            }
        }
        int n = s.length();
        amt = ((amt % n) + n) % n;
        return s.substring(amt) + s.substring(0, amt);
    }
}
