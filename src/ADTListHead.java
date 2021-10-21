public class ADTListHead {
    private Node first;
    private int numItems;

    public ADTListHead() {
        first = null;
        numItems = 0;
    }

    public Node find(int index) {
        if (index >= 0 && index < numItems) {
            Node current = first;
            for (int i = 0; i < index; i++) {
                current = current.getNext();
            }
            return current;
        }

        System.out.println("out of range: 0 - " + (numItems-1));
        return null;
    }
    
    //oskar gryglewski
}
