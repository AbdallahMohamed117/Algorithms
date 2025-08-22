package dp;
import java.util.Arrays;
import java.util.Collection;
public class LIS {
    public static int lis(String A) {
        int a = A.length();
        int[] x = new int[a];
        Arrays.fill(x,1);
        for(int i = a-1;i>=0;--i) {
            for(int j = i; j < a;++j) {
                if(A.charAt(j) > A.charAt(i))
                    x[i] = Math.max(x[i],1+x[j]);
            }
        }
        return Arrays.stream(x).max().getAsInt();
    }
}
