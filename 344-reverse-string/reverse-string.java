class Solution {
    private void swap(int left, int right, char[] s){
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;
    }
    public void reverseString(char[] s) {
        int left = 0, right = s.length-1;
        while(left<=right) {
            swap(left,right,s);
            left++;
            right--;
        }
    }
}