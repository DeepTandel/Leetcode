class Solution {
    public boolean isValid(String s2) {
        char[] stack = new char[s2.length()];
        int i=-1;
        for(char ch : s2.toCharArray()) {
            if(ch=='(' || ch=='{' || ch=='['){
                stack[++i] = ch;
            } else if(ch == ')') {
                if(i==-1 || stack[i--]!='(') {
                    return false;
                }
            } else if(ch == '}') {
                if(i==-1 || stack[i--]!='{') {
                    return false;
                }
            } else if(ch == ']'){
                if(i==-1 || stack[i--]!='[') {
                    return false;
                }
            }
        }
        return (i == -1);
    }
}