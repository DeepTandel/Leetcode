import java.util.HashMap;

class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> count = new HashMap<>();
        char[] ch = s.toCharArray();

        for(char ch1 :  ch) {
            count.put(ch1, count.getOrDefault(ch1, 0)+1);
        }

        for(int i=0; i<ch.length; i++) {
            if(count.get(ch[i]) == 1) {
                return i;
            }
        }

        return -1;
    }
}
