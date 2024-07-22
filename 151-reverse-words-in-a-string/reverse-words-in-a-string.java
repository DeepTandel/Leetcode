class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        StringBuilder result = new StringBuilder();
        int end = s.length();
        for (int i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i) == ' ') {
                result.append(s.substring(i+1, end)).append(" ");
                end = i;
                while(i>=0 && s.charAt(i) == ' '){
                    i--;
                }
                end = i+1;
            }
        }
        result.append(s.substring(0, end));
        return result.toString();
    }
}
