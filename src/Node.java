public class Node {
    private int item;
    private Node next;

    public Node(int item) {
        this.item = item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public int getItem() {
        return item;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return next;
    }
}

