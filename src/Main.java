import java.util.HashSet;
public class Main {
        public static void main(String [] args) {
            HashSet<String> p = new HashSet<>();
            p.add("A");
            p.add("CT");
            p.add("TG");
            p.add("ACTG");
            String dna = "ACTG";

            int k = 5;

            int s = dp.PS9.proteinParsing(dna,p,k);

            System.out.println(s);
        }
}