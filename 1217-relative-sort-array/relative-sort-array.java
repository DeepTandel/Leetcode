class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] freq = new int[1001];
        for(int arr : arr1) {
            freq[arr]++;
        }
        int[] ans = new int[arr1.length];
        int i=0;
        for(int arr : arr2) {
            while(freq[arr] != 0){
                ans[i] = arr;
                freq[arr]--;
                i++;
            }
        }

        for(int j=0; j<freq.length; j++) {
            while(freq[j] > 0){
                ans[i] = j;
                freq[j] --;
                i++;
            }
        }
        
        return ans;
    }
}