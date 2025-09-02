import java.util.HashMap;
public class Main {
        public static void main(String [] args) {
            char [][] forest = {
                    {'E', 'E', 'M', 'E', 'T'},
                    {'T', 'E', 'T', 'M', 'E'},
                    {'E', 'M', 'E', 'E', 'E'},
                    {'E', 'T', 'E', 'M', 'E'},
                    {'M', 'E', 'E', 'T', 'E'}
            };
            int paths = dp.PS8.plum(forest);
            System.out.println(paths);
        }
}