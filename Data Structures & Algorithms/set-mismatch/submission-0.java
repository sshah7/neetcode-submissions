class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] result =new int[2];
        Set<Integer> setRe = new HashSet<>();
        
        for(int i=0; i<nums.length; i++){
            if(setRe.contains(nums[i])){
                result[0] = nums[i];
            }
            setRe.add(nums[i]);
        }

        for(int i=1;i<=nums.length; i++){
            if(!setRe.contains(i)){
                result[1] = i;
                break;
            }
        }
        return result;
    }
}