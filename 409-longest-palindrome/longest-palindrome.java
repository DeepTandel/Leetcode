class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<>();
        int ans = 0;
        for(char ch : s.toCharArray()){
            if(set.contains(ch)){
                ans +=2;
                set.remove(ch);
            } else {
                set.add(ch);
            }
        }
        if(set.size() > 0) {
            ans +=1;
        }
        return ans;
    }
}