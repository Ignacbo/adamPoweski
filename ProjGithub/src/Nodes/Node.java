package Nodes;

public class Node <T>{
    protected T element;
    Node <T> next;

    protected Node(T element) {
        this.element = element;
    }

    public Node<T> getNext() {
        return next;
    }
}
