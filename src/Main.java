import java.util.HashMap;
public class Main {
        public static void main(String [] args) {
            HashMap<Integer,Integer> memo = new HashMap<>();
            int fib = dp.Fib.fibM(6,memo);
            System.out.println(fib);
        }
}