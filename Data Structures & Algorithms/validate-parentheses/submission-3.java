class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2 !=0) return false;
        Stack<Character> store = new Stack<>();
        char[] char1 = s.toCharArray();
        for(char ch: char1){
            if(ch=='{' || ch=='[' || ch=='(' ){
                store.push(ch);
            }else{
                if(store.isEmpty()) return false;
                char newBrac = store.pop();
                if(ch=='}' && newBrac !='{')  return false;
                if(ch==']' && newBrac !='[')  return false;
                if(ch==')' && newBrac !='(')  return false;
            }

        } 
        return store.isEmpty();
    }
}
