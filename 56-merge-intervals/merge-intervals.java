class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> res = new ArrayList<>();
        int current_interval[] = intervals[0] ;


        for(int i=0; i< intervals.length; i++) {
            if(intervals[i][0] <= current_interval[1]){
                current_interval[1] = Math.max(current_interval[1], intervals[i][1]);
            }else {
                res.add(current_interval);
                current_interval = intervals[i];
            }
        }
        res.add(current_interval);
        return res.toArray(new int[res.size()][]);
    }
}