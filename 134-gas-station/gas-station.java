class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sumCost = 0;
        int sumGas = 0;
        int n = gas.length;
        int ans = 0;
        int a = 0;
        
        for(int i=0; i<n; i++) {
            sumCost += cost[i];
            sumGas += gas[i];
            ans += (gas[i] - cost[i]);
            if(ans < 0) {
                ans = 0;
                a = i+1;
            }
        }
        if (sumCost > sumGas) {
            return -1;
        }
        return a;
    }
}