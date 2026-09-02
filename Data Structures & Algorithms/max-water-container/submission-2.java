class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right= heights.length -1;

        int maxWater= 0;
        int maxHeightLeft = Integer.MIN_VALUE;
        int maxHeightRight = Integer.MIN_VALUE;

        while(left<right){
            maxHeightLeft = heights[left];
            maxHeightRight = heights[right];
            maxWater= Math.max(maxWater, (right-left)* Math.min(maxHeightLeft,maxHeightRight));

            if(maxHeightLeft<maxHeightRight){
                left++;
            }else{
                right--;
            }
        }
        return maxWater;
    }
}
