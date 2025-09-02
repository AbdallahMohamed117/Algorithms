package dp;
public class RodCutting {
    public static int rod(int[]value) {
        int n = value.length;
        int[]x = new int[n];
        for(int i = 0;i<n;++i) {
            int max = 0;
            for(int p = 0; p <= i;++p) {
                if(max < value[p] + x[i-p])
                    max = value[p] + x[i-p];
            }
            x[i] = max;

        }

        return x[n-1];
    }
}
