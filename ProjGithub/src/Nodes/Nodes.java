package Nodes;

public class Nodes {

    public static <T> void link(Node<T> n1, Node<T> n2){
        n1.next = n2;
    }

    public static <T> Node<T>create(T element){
        return new Node<>(element);
    }

    public static <T> Node<T>pairOf(T e1, T e2){
        Node<T> n1 = create(e1);
        Node<T> n2 = create(e2);
        link(n1,n2);
        return n1;
    }

    public static <T> Node<T>closedPairOf(T e1, T e2){
        Node<T> n1 = create(e1);
        Node<T> n2 = create(e2);
        link(n1,n2);
        link(n2,n1);
        return n1;
    }

    public static <T> Node <T>chainOf(T... elements){
        Node<T> first = create(elements[0]);
        Node currentNode = first;
        for(int i = 1;i< elements.length;i++){
            currentNode.next = create(elements[i]);
            currentNode = currentNode.next;
        }
        return first;
    }

    public static <T> Node <T>circleOf(T... elements){
        Node<T> first = create(elements[0]);
        Node currentNode = first;
        for(int i = 1;i< elements.length;i++){
            currentNode.next = create(elements[i]);
            currentNode = currentNode.next;
        }
        currentNode.next = first;
        return first;
    }


}
