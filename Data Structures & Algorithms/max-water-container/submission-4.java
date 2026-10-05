class Solution {
    public int maxArea(int[] heights) {
        int maxWater=0;
        int minHeight = Integer.MAX_VALUE;
        int left=0;
        int right=heights.length-1;
        while(left<right){
            minHeight= Math.min(heights[left], heights[right]);
            maxWater = Math.max(maxWater, (right-left) * minHeight);
            if(minHeight == heights[right]){
                right--;
            }else{
                left++;
            }
        }
        return maxWater;
    }
}
