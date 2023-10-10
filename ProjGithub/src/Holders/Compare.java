package Holders;

public class Compare <T extends Comparable>{

    public boolean compareValues(T a, T b){
        if (a.compareTo(b) > 0) {
            System.out.printf("Wartość %s jest większa od %s\n", a, b);
            return true;
        } else if (a.compareTo(b) < 0) {
            System.out.printf("Wartość %s jest mniejsza od %s\n", a, b);
            return false;
        }
        System.out.printf("Wartość %s = %s\n", a, b);
        return false;
    }
    }

//    public static void compareValues(int val1,int val2){
//        if (val1 > val2){
//            System.out.println(val1 + " is greater than " + val2);
//        } else if (val2 > val1){
//            System.out.println(val2 + " is greater than " + val1);
//        }else{
//            System.out.println(val1 + " is equal to " + val2);
//        }
//    }
//
//    public static void compareValues(double val1,double val2){
//        if (val1 > val2){
//            System.out.println(val1 + " is greater than " + val2);
//        } else if (val2 > val1){
//            System.out.println(val2 + " is greater than " + val1);
//        }else{
//            System.out.println(val1 + " is equal to " + val2);
//        }
//    }
//
//    public static void compareValues(String val1,String val2){
//        if (val1.compareTo(val2) > 0){
//            System.out.println(val1 + " is greater than " + val2);
//        } else if (val1.compareTo(val2) < 0){
//            System.out.println(val2 + " is greater than " + val1);
//        }else{
//            System.out.println(val1 + " is equal to " + val2);
//        }
//    }
//
//    public static void compareValues(float val1,float val2){
//        if (val1 > val2){
//            System.out.println(val1 + " is greater than " + val2);
//        } else if (val2 > val1){
//            System.out.println(val2 + " is greater than " + val1);
//        }else{
//            System.out.println(val1 + " is equal to " + val2);
//        }
//    }
//
//    public static void compareValues(byte val1,byte val2){
//        if (val1 > val2){
//            System.out.println(val1 + " is greater than " + val2);
//        } else if (val2 > val1){
//            System.out.println(val2 + " is greater than " + val1);
//        }else{
//            System.out.println(val1 + " is equal to " + val2);
//        }
//    }
//}

