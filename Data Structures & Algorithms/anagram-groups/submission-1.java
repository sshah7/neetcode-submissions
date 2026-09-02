class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> grp = new ArrayList<>();

        Map<String, List<String>> store = new HashMap<>();
        for(String str: strs){
            char[] char1 = str.toCharArray();
            Arrays.sort(char1);
            String sortedString = new String(char1);
            if(store.containsKey(sortedString)){
                store.get(sortedString).add(str);
            }else{
                List<String> result = new ArrayList<>();
                result.add(str);
                store.put(sortedString,result);   
            }
        }

        for(List<String> result: store.values()){
            grp.add(result);
        }
        return grp;
    }
}
