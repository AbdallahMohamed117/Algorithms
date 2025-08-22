package dp;

public class LCS {
    public static int lcs(String A,String B) {
        int a = A.length();
        int b = B.length();
        int [][]x = new int[a+1][b+1];
        for(int i = a-1;i >= 0;--i) {
            for(int j = b-1; j >= 0;--j) {
                if(A.charAt(i) == B.charAt(j)) {
                    x[i][j] = x[i+1][j+1] +1;
                }
                else {
                    x[i][j] = Math.max(x[i+1][j],x[i][j+1]);
                }
            }
        }
        return x[0][0]; //the length of LCS
    }
}
