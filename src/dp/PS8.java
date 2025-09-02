package dp;

import java.util.Arrays;

public class PS8 {
    public static int ss(int[]t) {
        int n = t.length;
        int[] x = new int[n];
        Arrays.fill(x,0);
        for(int i = 0; i < n-3;++i) {
            int p = n-i;
            int max1 = Math.max(x[i+1],t[i]+x[i+2]);
            int max2 = Math.max(max1,t[i]+t[i+1]+x[i+3]);
            x[i] = max2;
        }
        return x[0];
    }

    public static int diff(String A,String B) {
        int a = A.length();
        int b = B.length();

        int [][]x = new int[a][b];

        for(int i = a-1;i<=0;--i) {
            for(int j = b-1;j<=0;--j) {
                int min1 = Math.min(1+x[i-1][j],1+x[i][j-1]);
                int min2 = Math.min(min1,x[i-2][j-2]);
                x[i][j] = Math.max(min1,min2);
            }
        }
        return x[0][0];
    }

    public static int plum(char[][] forest) {
        int n = forest[0].length;
        int[][] dp = new int[n][n];
        int [][] k = new int[n][n];
        for(int i = 0; i < n;++i) {
            Arrays.fill(k[i],Integer.MIN_VALUE);
        }
        for(int i = 0;i<n;++i) {
            for(int j = 0;j<n;++j) {
                if(forest[i][j]=='T')
                    continue;
                else {
                    if(i ==0 && j == 0) {
                        dp[0][0] = 1;
                        k[0][0] = 0;
                    }
                    else {
                        if(i ==0 || j == 0) {
                            dp[i][j] = 1;
                            k[i][j] = Integer.MIN_VALUE;
                        }
                        else {int m = forest[i][j] =='M' ? 1 :0;
                        k[i][j] = m + Math.max(k[i-1][j],k[i][j-1]);
                        int x1 = ((m + k[i-1][j]) == k[i][j]) ?  dp[i-1][j]:0;
                        int x2 = ((m + k[i][j-1]) == k[i][j]) ? dp[i][j-1]:0 ;
                        dp[i][j] = x1+x2;
                        }
                    }
                }
            }
        }

        return dp[n-1][n-1];
    }
}
