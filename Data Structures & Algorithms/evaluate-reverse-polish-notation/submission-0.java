class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> num = new Stack<>();

        for(int i=0; i<tokens.length; i++){
            if(tokens[i].equals("+")){
                int b = num.pop();
                int a = num.pop();
                num.push(a + b);
            } else if(tokens[i].equals("-")){
                int b = num.pop();
                int a = num.pop();
                num.push(a - b);
            } else if(tokens[i].equals("*")){
                int b = num.pop();
                int a = num.pop();
                num.push(a * b);
            } else if(tokens[i].equals("/")){
                int b = num.pop();
                int a = num.pop();
                num.push(a / b);
            } else {
                num.push(Integer.parseInt(tokens[i]));
            }
        }
        return num.pop();
    }
}