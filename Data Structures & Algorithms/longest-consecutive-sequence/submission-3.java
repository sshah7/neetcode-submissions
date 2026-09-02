class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Set<Integer> store = new HashSet<>();
        int maxCount=1;
        for(int n: nums){
            store.add(n);
        }
        for(int n: nums){
            int j=n;
            int count=0;
            if(!store.contains(n-1)){
                while(store.contains(j)){
                    count++;
                    j++;
                }
            maxCount= Math.max(count, maxCount);
        }
    }
    return maxCount;
    }
}
