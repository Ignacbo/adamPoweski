import Holders.Compare;
import Nodes.Node;
import Nodes.Nodes;

public class Main {
    public static void main(String[] args) {

//        inne.LiczbaHolder lh1 = new inne.LiczbaHolder(12);
//        inne.LiczbaHolder lh2 = new inne.LiczbaHolder(44);
//
//        System.out.println(lh1.getI());
//        lh1.setI(10);
//        System.out.println(lh1.getI());
//
//        inne.GenericHolder gh1 = new inne.GenericHolder("xyz");
//        System.out.println(gh1.getA());
//        gh1.setA("abcd");
//        System.out.println(gh1.getA());
//        gh1.setA(123);
//        System.out.println(gh1.getA());
//
//        inne.GenericHolder gh2 = new inne.GenericHolder(new Holders.Car());


        /** Zadanie 1.1 - 1.2 */

//        Compare MyComparator = new Compare();
//        MyComparator.compareValues(1,1);
//        MyComparator.compareValues(1.1d,2.2d);
//        MyComparator.compareValues(1.0f,0.1f);
//        MyComparator.compareValues((byte)1, (byte)2);
//        MyComparator.compareValues("00001", "2");

        /** Zadanie 1.3 */
        /*
        Holders.Compare MyComparator = new Holders.Compare();
        MyComparator.compareValues(new Holders.Car("BMW", 100.1d, 100, 100), new Holders.Car("AUDI", 100d, 100, 100));
        MyComparator.compareValues(new Holders.Car("BMW", 100, 101, 100), new Holders.Car("AUDI", 100, 100, 100));
        MyComparator.compareValues(new Holders.Car("BMW", 100, 100, 999), new Holders.Car("AUDI", 100, 101, 100));
        MyComparator.compareValues(new Holders.Car("BMW", 100.1f, 100, (byte)101), new Holders.Car("AUDI", 100.1f, 100, (byte)100));
         */


//        Node n1 = new Node<>(10);
        Node first = Nodes.circleOf(1,2,3);
        System.out.println("node1: "+first);
        System.out.println("node2: "+first.getNext());
        System.out.println("node3: "+first.getNext().getNext());
        System.out.println("node4: "+first.getNext().getNext().getNext());
    }
}