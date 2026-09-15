class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] charCounts = new int[26];
        for (char c : chars.toCharArray()) {
            charCounts[c - 'a']++;
        }

        int totalLength = 0;
        for (String word : words) {
            int[] wordCounts = new int[26];
            boolean isGood = true;
            for (char c : word.toCharArray()) {
                int idx = c - 'a';
                wordCounts[idx]++;
                if (wordCounts[idx] > charCounts[idx]) {
                    isGood = false;
                    break;
                }
            }
            if (isGood) {
                totalLength += word.length();
            }
        }
        return totalLength;
    }
}