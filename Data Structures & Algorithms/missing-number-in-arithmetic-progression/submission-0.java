class Solution {
    public int missingNumber(int[] arr) {
        int count=0;
        int n = arr.length;
        int left=0;
        int right= n-1;
        int diff = (arr[right] - arr[left])/n;
        if(diff == 0){
            return arr[0];
        }
        while(left < right){
            int mid = left + (right - left) / 2;
            if(arr[mid] == arr[0] + mid * diff){
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return arr[0] + left * diff;
    }
}