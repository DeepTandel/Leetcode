class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int ans=0;
        int temp = x;

        while(x>0){
            int rem=x%10;
            ans=ans*10 + rem;
            x=x/10;
        }
        if(ans==temp) return true;
        else return false;
    }
}