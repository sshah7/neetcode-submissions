class Solution {
    public int countElements(int[] arr) {
        Set<Integer> set = new HashSet<>();
        int count=0;
        for(int x : arr){
            set.add(x);
        }
        for(int i=0; i<arr.length; i++){
            if(set.contains(arr[i]+1)){
                count++;
            }

        }
        return count;
    }
}