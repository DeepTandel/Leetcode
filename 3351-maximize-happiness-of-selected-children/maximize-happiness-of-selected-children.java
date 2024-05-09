class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long sum = 0;
        int index = 0;
        for(int i=happiness.length-1; i>=0; i--) {
            sum = sum + Math.max(happiness[i]-index, 0);
            index++;
            if(index >= k) {
                break;
            }
        }
        return sum;
    }
}