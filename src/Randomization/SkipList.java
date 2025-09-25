package Randomization;
import java.util.Random;
public class SkipList {
    private class Node{
        int value;
        Node next;
        Node below;

        public Node(int v) {
            value = v;
            next = null;
            below = null;
        }
    }

    private Node head;
    private int level;
    private Random random;

    public SkipList() {
        level = 0;
        head = new Node(Integer.MIN_VALUE);
        random = new Random();
    }

    public Node insert(int v){}
    public boolean exist(int v){
        Node n = head;
        while(n.below != null) {
            n = n.below;
            while(v >= n.next.value) {
                n = n.next;
            }
        }
        return n.value == v;
    }
    public Node delete(int v) {}
}
