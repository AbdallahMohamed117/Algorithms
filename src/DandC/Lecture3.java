package DandC;
public class Lecture3 {
    public static int NULL = -1;
    public  class VEBTree{
        VEBNode root;
        int size;
        int sqrtSize;
        public VEBTree(int size) {
            root = new VEBNode(size);
            this.size = size;
            this.sqrtSize = (int)Math.sqrt(size);
        }
        private int high(int x) {
            return x/sqrtSize;
        }
        private int low(int x) {
            return x - high(x);
        }
        public void insert(int x) {
            insertR(root,x);
        }
        public void sucess(int x) {
            sucessR(root,x);
        }
        public void delete(int x) {
            deleteR(root,x);
        }


        private void insertR(VEBNode r,int x){}
        private void sucessR(VEBNode r,int x){};
        private void deleteR(VEBNode r, int x){}

    }
    private class VEBNode {
        private int universeSize;
        private int min;
        private int max;
        private VEBNode summary;
        private VEBNode[] clusters;

        public VEBNode(int uniSize) {
            this.universeSize = uniSize;
            min = NULL;
            max = NULL;

        }

        private void initSC() {
            int scSize = (int) Math.sqrt(universeSize);
            summary = new VEBNode(scSize);
            clusters = new VEBNode[scSize];

            for(int i = 0; i < scSize;++i) {
                clusters[i] = new VEBNode(scSize);
            }

        }
    }
}
