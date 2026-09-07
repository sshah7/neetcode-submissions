class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        StringBuilder str = new StringBuilder();
        String[] strArr = path.split("/");
        for(int i=0; i<strArr.length; i++){
            if(strArr[i].equals("..")){
                if(!stack.isEmpty()) {
                    stack.pop();
                }
            } else if(!strArr[i].equals("") && !strArr[i].equals(".")) {
                stack.push(strArr[i]);
            }
        }
        for(String s : stack) {
            str.append("/").append(s);
        }
        return str.length() > 0 ? str.toString() : "/";
    }
}