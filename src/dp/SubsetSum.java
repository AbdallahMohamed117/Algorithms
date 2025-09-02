package dp;

public class SubsetSum {
    public static boolean subsetSum(int T, int[]set) {
        int n = set.length;
        boolean[][] x = new boolean[n][T];
        for(int i = n-1;i>=0;--i) {
            for(int t = 0; t < T;++t) {
                if(t == 0) x[i][t] = true;
                else if(i == n-1) x[i][t] = false;
                else {
                    x[i][t] = ((t >= set[i+1]) && x[i+1][t-set[i+1]]) || x[i+1][t];
                }
            }
        }


        return x[0][T-1];
    }
}
