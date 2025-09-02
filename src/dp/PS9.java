package dp;

public class PS9 {
    public static int coinCrafting(int n, int[] p,int[]k) {
        int[][] x = new int[n+1][n+1];

        for(int i = 0; i <= n;++i) {
            for(int j = 0;j <= n;++j) {
                if(i ==0 || j == 0) x[i][j] = 0;
                else if(i < k[i-1]) x[i][j] = x[i][j-1];
                else {
                    x[i][j] = Math.max(p[i-1] + x[i-k[i-1]][j-1],x[i][j-1]);
                }
            }
        }
        return x[n][n];
    }
}
