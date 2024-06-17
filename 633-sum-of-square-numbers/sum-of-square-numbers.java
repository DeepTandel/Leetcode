class Solution {
    public boolean judgeSquareSum(int c) {
        for(long i=0; i*i <=c; i++){
            double check = Math.sqrt(c - i*i);
            if(check == (int)check) {
                return true;
            }
        }
        return false;
    }
}