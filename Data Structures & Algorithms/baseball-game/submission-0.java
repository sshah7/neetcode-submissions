class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> op = new Stack<>();
        int result=0;
        for(String o: operations){
            if(!o.equals("C") && !o.equals("D") && !o.equals("+")){
                int temp = Integer.parseInt(o);
                op.push(temp);
                result+=temp;
            }else if(o.equals("+")){
                int temp = op.pop();
                int sum = temp + op.peek();
                op.push(temp);
                op.push(sum);
                result+=sum;
            }else if(o.equals("C")){
                result-=op.pop();
            }else if(o.equals("D")){
                op.push(op.peek()*2);
                result+=op.peek();
            }
        }
        return result;
    }
}