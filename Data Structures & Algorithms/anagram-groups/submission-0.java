class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> store = new HashMap<>();

        for(String s: strs){
            char[] char1 = s.toCharArray();
            Arrays.sort(char1);
            String sortS = new String(char1);
            store.computeIfAbsent(sortS, k -> new ArrayList()).add(s);
        }

        for(List<String> s: store.values()){
            result.add(s);
        }
        return result;
    }
}