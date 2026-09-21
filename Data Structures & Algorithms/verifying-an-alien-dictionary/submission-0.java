class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        Map<Character, Integer> store = new HashMap<>();
        for(int i=0;i<order.length();i++){
            store.put(order.charAt(i), i);
        }

        for(int i=0; i<words.length-1; i++){
            String w1 = words[i];
            String w2 = words[i+1];
            boolean foundDiff = false;
            for(int j=0; j<Math.min(w1.length(), w2.length()); j++){
                char char1 = w1.charAt(j);
                char char2 = w2.charAt(j);
                if(char1 != char2){
                    if(store.get(char1)>store.get(char2)){
                        return false;
                    }
                    foundDiff = true;
                    break;
                }
            }
            if(!foundDiff && w1.length() > w2.length()){
                return false;
            }
        }
        return true;
    }
}