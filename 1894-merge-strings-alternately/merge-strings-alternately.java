class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder str = new StringBuilder();
        int a,b;
        if(word1.length() > word2.length()) {
            a=word1.length();
            b=word2.length();
        } else {
            a=word2.length();
            b=word1.length();
        }
        for(int i=0; i<a; i++) {
            if( i < b) {
                str.append(word1.charAt(i));
                str.append(word2.charAt(i));
            } else if(word1.length() > word2.length()){
                str.append(word1.charAt(i));
            } else{
                str.append(word2.charAt(i));
            }
        }
        return str.toString();
    }
}