package dp;

public class ASAP {
    public static int MAX = 1000000000;
    public static long[][][] floydWarshalll(int[][] weight) {
        int n = weight.length;
        long[][][] x = new long[n][n][n+1];
        for(int k = 0; k <= n;++k) {
            for(int u = 0;u < n;++u) {
                for(int v = 0;v<n;++v) {
                    if(k==0) {
                        if(u == v) x[u][v][0] = 0;
                        else if(weight[u][v] != 0) x[u][v][0] = weight[u][v];
                        else x[u][v][0] = Integer.MAX_VALUE;

                    }
                    else{
                        x[u][v][k] = Math.min(x[u][k-1][k-1]+x[k-1][v][k-1],x[u][v][k-1]);
                    }
                }
            }
        }

        return x;
    }
}
