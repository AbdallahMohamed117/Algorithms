package Randomization;
import java.util.Random;
public class SkipList {
    private class Node{
        int value;
        Node[] forward;

        public Node(int v,int level) {
            value = v;
            forward = new Node[level+1];
        }
    }

    private Node head;
    private int levelCap;
    private int level;
    private Random random;

    public SkipList() {
        levelCap = 16;
        level = 0;
        head = new Node(Integer.MIN_VALUE,levelCap);
        random = new Random();
    }


}
