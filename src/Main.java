import java.util.HashMap;
public class Main {
        public static void main(String [] args) {
            HashMap<Integer,Integer> memo = new HashMap<>();
            int lcs = dp.LCS.lcs("hieroglyphology","michaelangelo");
            System.out.println(lcs);
        }
}