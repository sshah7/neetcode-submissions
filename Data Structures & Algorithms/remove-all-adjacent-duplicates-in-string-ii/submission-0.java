class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Character> char1 = new Stack<>();
        Stack<Integer> count = new Stack<>();

        for(int i=0; i<s.toCharArray().length; i++){
            char c = s.charAt(i);
            if(!char1.isEmpty() && char1.peek() == c){
                count.push(count.pop() + 1);
            } else {
                char1.push(c);
                count.push(1);
            }
            if(count.peek() == k){
                char1.pop();
                count.pop();
            }
        }

        StringBuilder sb = new StringBuilder();
        while(!char1.isEmpty()){
            char c = char1.pop();
            int cnt = count.pop();
            for(int j = 0; j < cnt; j++){
                sb.append(c);
            }
        }

        return sb.reverse().toString();
    }
}