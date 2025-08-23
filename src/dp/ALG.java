package dp;

public class ALG {
    public static int alg(int[] coins) {
        int n = coins.length;
        int[][] x = new int[n][n];

        for(int i = 0; i < n; ++i) {
            x[i][i] = coins[i];
        }

        for(int len = 2; len <= n;++len) {
            for(int i = 0; i <= n - len; ++i) {
                int j = i + len-1;

                int me1 = coins[i] + Math.min((i+2 <= j) ? x[i+2][j]:0,
                        (i+1 <= j-1)? x[i+1][j-1]:0);

                int me2 = coins[j] + Math.min((i+1 <= j-1) ? x[i+1][j-1]:0,
                        (i <= j-2)? x[i][j-2]:0);

                x[i][j] = Math.max(me1,me2);
            }

        }

        return x[0][n-1];
    }
}
