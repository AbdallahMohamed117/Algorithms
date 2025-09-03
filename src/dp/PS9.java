package dp;
import java.util.HashSet;
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

    public static int proteinParsing(String strand,HashSet<String> marker,int k) {
        int n = strand.length();
        int[]x = new int[n+1];
        for(int i = n ;i>=0;--i) {
            if(i == n) x[i] = 0;
            else {
                for(int j = 1; j < Math.min(k,n-i)  ; ++j) {
                    String sub = strand.substring(i,i+j);
                    if(marker.contains(sub)) {
                        x[i] = Math.max(x[i],1+x[i+j]);
                    }

                }
            }
        }
        return x[0];
    }

}
