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
}
