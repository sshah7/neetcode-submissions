class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0)    return 0;
        Set<Integer> store = new HashSet<>();
        int result=0;
        for(int a: nums){
            store.add(a);
        }

        for(int num: store){
            if(store.contains(num-1)){
                continue;
            }
            int currentNum = num;
            int maxCount=1;
            while(store.contains(currentNum+1)){
                maxCount++;
                currentNum++;
            }
            result= Math.max(maxCount,result);
        }
        return result;
    }
}
