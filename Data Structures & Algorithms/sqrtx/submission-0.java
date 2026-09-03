class Solution {
    public int mySqrt(int x) {
        if(x<2) return x;
        long left=0;
        long right = x;
        long mid=0;
        while(left<=right){
            mid = left+(right-left)/2;
            long result = mid*mid;
            if(x==result)   return (int)mid;
            if(result>x){
                right =mid-1;
            }else {
                left = mid+1;
            }
        }
        return (int)right;
    }
}