class Solution {
    public int scoreOfString(String s) {
        int sum = 0;
        for(int i=0; i<s.length()-1; i++) {
            char ch = s. charAt(i);
            char ch1 = s. charAt(i+1);
            sum += Math.abs((int)ch - (int)ch1);
        }
        return sum;
    }
}