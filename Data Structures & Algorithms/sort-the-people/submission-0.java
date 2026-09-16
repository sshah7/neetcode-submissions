class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> result = new HashMap<>();

        for(int i=0; i<heights.length; i++){
            result.put(heights[i], names[i]);
        }

        return result.entrySet().stream()
                    .sorted(Map.Entry.<Integer, String>comparingByKey().reversed())
                    .map(Map.Entry::getValue)
                    .toArray(String[]::new);
    }
}