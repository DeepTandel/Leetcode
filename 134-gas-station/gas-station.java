class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sumCost = 0;
        for (int c : cost) {
            sumCost += c;
        }
        int sumGas = 0;
        for (int g : gas) {
            sumGas += g;
        }

        if (sumCost > sumGas) {
            return -1;
        }

        int n = gas.length;
        int ans = 0;
        int a = 0;
        
        for(int i=0; i<n; i++) {
            ans += (gas[i] - cost[i]);
            if(ans < 0) {
                ans = 0;
                a = i+1;
            }
        }
        return a;
    }
}