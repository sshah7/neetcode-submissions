class Solution {
    public List<String> commonChars(String[] words) {
        List<String> result = new ArrayList<>();
        int[] count = new int[26];
        Arrays.fill(count, Integer.MAX_VALUE);
        for(int i=0; i<words.length; i++){
            int[] currentCount = new int[26];
            for(int j=0; j<words[i].length(); j++){
                currentCount[words[i].charAt(j) - 'a']++;
            }
            for(int k=0; k<26; k++){
                count[k] = Math.min(count[k], currentCount[k]);
            }
        }
        for(int i=0; i<26; i++){
            while(count[i] > 0){
                result.add(String.valueOf((char)(i + 'a')));
                count[i]--;
            }
        }
        return result;
    }
}