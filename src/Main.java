
public class Main {
        public static void main(String [] args) {
            int [] sorted = {1,2,3,4,5,6};
            int [] toSort = {5,3,2,6,4,1,3,7};
            dp.Lecture1.mergeSort(toSort,0,toSort.length-1);
            for(int i : toSort) {
                System.out.print(i + " ");
            }

        }
}