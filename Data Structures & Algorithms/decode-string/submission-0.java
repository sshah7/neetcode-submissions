class Solution {
    public String decodeString(String s) {
        Stack<Character> str = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch != ']') {
                str.push(ch);
            } else {
                StringBuilder sb = new StringBuilder();
                while (!str.isEmpty() && str.peek() != '[') {
                    sb.insert(0, str.pop());
                }
                str.pop(); // pop '['

                StringBuilder countStr = new StringBuilder();
                while (!str.isEmpty() && Character.isDigit(str.peek())) {
                    countStr.insert(0, str.pop());
                }
                int k = Integer.parseInt(countStr.toString());

                String repeated = sb.toString().repeat(k);
                for (char c : repeated.toCharArray()) {
                    str.push(c);
                }
            }
        }

        StringBuilder result = new StringBuilder();
        for (char c : str) {
            result.append(c);
        }
        return result.toString();
    }
}