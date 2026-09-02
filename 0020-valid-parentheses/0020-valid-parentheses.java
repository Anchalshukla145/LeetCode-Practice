class Solution {
    public boolean isValid(String s) {
        Stack<Character> res = new Stack<>();
        for(char ch :s.toCharArray()){
            if(ch=='(' || ch=='{' || ch =='['){
                res.push(ch);
            }
            if(!res.isEmpty() && (
    (res.peek() == '(' && ch == ')') ||
    (res.peek() == '{' && ch == '}') ||
    (res.peek() == '[' && ch == ']')
)){
                res.pop();
            }
            else if(ch==')' || ch =='}' || ch==']'){
                res.push(ch);
            }
        }
        return res.isEmpty();
    }
}