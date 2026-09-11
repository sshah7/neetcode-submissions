class Solution {
    public boolean areSentencesSimilar(String[] sentence1, String[] sentence2, List<List<String>> similarPairs) {
        if (sentence1.length != sentence2.length) {
            return false;
        }

        Set<String> set = new HashSet<>();
        for (List<String> pair : similarPairs) {
            set.add(pair.get(0) + "#" + pair.get(1));
            set.add(pair.get(1) + "#" + pair.get(0));
        }

        for (int i = 0; i < sentence1.length; i++) {
            String w1 = sentence1[i];
            String w2 = sentence2[i];
            if (!w1.equals(w2) && !set.contains(w1 + "#" + w2)) {
                return false;
            }
        }

        return true;
    }
}