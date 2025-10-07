package Randomization;
import java.util.Random;
public class SkipList {
    private class Node{
        int value;
        Node next;
        Node below;
        Node prev;
        Node abov;
        public Node(int v) {
            value = v;
            next = null;
            below = null;
            prev = null;
            abov=null;
        }
    }
    private Node head;
    private Node tail;

    public int n;

    public int h;
    public Random r;

    public SkipList() {
        head = new Node(0);
        Node p1 = new Node(Integer.MIN_VALUE);
        head.next = p1;

        tail = new Node(0);
        Node p2 = new Node(Integer.MAX_VALUE);
        tail.next = p2;

        p1.next = p2;
        p2.prev = p1;

        n = 0; h = 0;

        r = new Random();
    }

    public Node insert(int v){
        Node q = find(v);
        Node p;
        if(q.value == v)
            return find(v); //already exists
        else {
            p = new Node(v);
            p.prev = q;
            p.next = q.next;
            q.next.prev = p;
            q.next = p;

            int i = 0;
            while(r.nextBoolean()) {
                if(i>=h) {
                    createNewTopLayer();
                }
                while(p.abov != null) {
                    p = p.prev;
                }
                p = p.abov;
            }

            Node e = new Node(0);
            e.prev = p;
            e.next = p.next;
            e.below = q;

            p.next.prev = e;
            p.next = e;
            q.abov = e;

            q = e;

            ++i;

        }
        ++n;
        return p;
    }

    public Node find(int v){
        Node n = head.next;
        while(true) {
            while(n.next.value != Integer.MAX_VALUE && n.next.value < v) {
                n = n.next;
            }
            if(n.below != null)
                n = n.below;
            else break;
        }
        return n; //closest or same as v
    }
    public int delete(int v) {
        Node del = find(v);

        if(del.value != v)
            return -1;
        else {
            while(del.abov!=null) {
                del.prev.next = del.next;
                del.next.prev = del.prev;
                del.next = del.prev = null;

                del = del.abov;
            }
        }
        return v;
    }

    private void createNewTopLayer() {
        Node p1 = new Node(Integer.MIN_VALUE);
        Node p2 = new Node(Integer.MAX_VALUE);

        p1.next = p2;
        p1.below = head;

        p2.prev = p2;
        p2.below = tail;

        head.abov = p1;
        tail.abov = p2;

        head = p1;
        tail = p2;

        h++;
    }
}
