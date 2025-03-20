class Solution {
    public int minAddToMakeValid(String s) {
       Stack<Character> stack = new Stack<Character>();
       int cnt = 0;
        for (char c : s.toCharArray()) {
            if(c == '('){
                stack.push(')');
            }else if(c == '{'){
                stack.push('}');
            }else if(c == '['){
                stack.push(']');
            }else if (stack.isEmpty() || stack.pop() != c){
			    cnt++;
            }
        }
        return stack.size() + cnt;
    }
}