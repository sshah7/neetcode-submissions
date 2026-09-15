class Solution {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> store = new HashMap<>();
        int maxCount=-1;
        for(int i=0; i<arr.length; i++){
            store.put(arr[i], store.getOrDefault(arr[i],0)+1);
        }

        for(var set: store.entrySet()){
           int key = set.getKey();
           int value= set.getValue();

           if(key==value){
                maxCount=Math.max(maxCount, key);
           }
        }
        return maxCount;
    }
}