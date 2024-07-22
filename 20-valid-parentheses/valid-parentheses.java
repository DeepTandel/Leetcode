class Solution {
    public boolean isValid(String s2) {
        Stack<Character> s = new Stack<>();
        for(char ch : s2.toCharArray()) {
            if(ch=='(' || ch=='{' || ch=='['){
                s.push(ch);
            } else if(ch == ')') {
                if(s.isEmpty() || s.pop()!='(') {
                    return false;
                }
            } else if(ch == '}') {
                if(s.isEmpty() || s.pop()!='{') {
                    return false;
                }
            } else if(ch == ']'){
                if(s.isEmpty() || s.pop()!='[') {
                    return false;
                }
            }
        }
        return s.isEmpty();
    }
}