class Solution {
    public int maxArea(int[] heights) {
        int minHeight = Integer.MAX_VALUE;
        int maxWater = 0;
        int left=0;
        int right = heights.length-1;

        while(left<right){
            minHeight = Math.min(heights[left], heights[right]);
            maxWater = Math.max(maxWater, minHeight * (right-left));

            if(heights[left]< heights[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxWater;
    }
}
