class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())    return false;
        Map<Character, Integer> store =new HashMap<>();
        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();
        for(char i: charS){
            store.put(i, store.getOrDefault(i,0)+1);
        }


        for(char i: charT){
            if(!store.containsKey(i)){   return false;}
            if(store.get(i)>1){
                store.put(i, store.get(i)-1);
            }else{
                store.remove(i);
            }
        }
    return true;
    }
}
