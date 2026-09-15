class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> result = new HashMap<>();
        for (String s: arr){
            result.put(s, result.getOrDefault(s,0)+1);
        }

        String sr = Arrays.stream(arr)
                    .filter(s -> result.get(s) == 1)
                    .skip(k - 1)
                    .findFirst()
                    .orElse("");

        return sr;
    }
}