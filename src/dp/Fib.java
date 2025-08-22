package dp;
import java.util.HashMap;
public class Fib {
    //without memoization
    public static int fib(int n) {
        if(n <=1)
            return n;
        else return fib(n-1) + fib(n-2);
    }
    //with memoization
    public static int fibM(int n,HashMap<Integer,Integer> memo ) {
        if(memo.containsKey(n)) {
            return memo.get(n);
        }
        else {
            if(n <=1)
                return n;
            else {
                memo.put(n,fibM(n-1,memo) + fibM(n-2,memo));
                return memo.get(n);
            }
        }
    }
}
