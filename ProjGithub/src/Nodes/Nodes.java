package Nodes;

public class Nodes {

    public static <T> void link(Node<T> n1, Node<T> n2){
        n1.next = n2;
    }

    public static <T> Node<T>create(T element){
        return new Node<>(element);
    }

    public static <T> Node<T>pairOf(T e1, T e2){
        Node<T> n1 = new Node<>(e1);
        Node<T> n2 = new Node<>(e2);
        link(n1,n2);
        return n1;
    }

    public static <T> Node<T>closedPairOf(T e1, T e2){
        Node<T> n1 = new Node<>(e1);
        Node<T> n2 = new Node<>(e2);
        link(n1,n2);
        link(n2,n1);
        return n1;
    }


}
