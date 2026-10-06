class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> finalResult = new ArrayList<>();
        Map<String, List<String>> store  = new HashMap<>();

        for(String str: strs){
            char[] sortedArray = str.toCharArray();
            Arrays.sort(sortedArray);
            String og = new String(sortedArray);
            String temp1 = str;

            if(store.containsKey(og)){
                store.get(og).add(temp1);
            }else{
                store.put(og, new ArrayList<>(Arrays.asList(temp1)));
            }
        }

        return new ArrayList<>(store.values());
    }
}
