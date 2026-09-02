class Solution {
    public int[] getConcatenation(int[] nums) {
        int n= nums.length;
        if(n<1) return new int[]{};
        int[] ans = new int[2*n];
        int k=0;
        for(int i=0; i<ans.length; i++){
            if(i<nums.length){
                ans[i] = nums[i];
            }else if(k<nums.length){
                ans[i] = nums[k];
                k++;
            }
        }
        return ans;
    }
}