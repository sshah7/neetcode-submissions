class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = words.length;
        int[] prefix = new int[n + 1];

        for (int i = 0; i < n; i++) {
            String currWord = words[i];
            boolean check = "aeiou".indexOf(currWord.charAt(0)) != -1 && "aeiou".indexOf(currWord.charAt(currWord.length() - 1)) != -1;
            prefix[i + 1] = prefix[i] + (check ? 1 : 0);
        }

        int[] result = new int[queries.length];
        for (int j = 0; j < queries.length; j++) {
            int[] currRange = queries[j];
            result[j] = prefix[currRange[1] + 1] - prefix[currRange[0]];
        }

        return result;
    }
}