import java.util.*;

class Untitled{
    @SuppressWarnings("unchecked")
   public static void main(String[] args) {
    Vector vec = new Vector();
//    Vector vec1 = new Vector();
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter the Elements to add as Vector");
    vec.addElement(5);
    //vec1.addElement(sc.nextLine());
    vec1.add(sc.nextLine());
    vec1.toArray();
    System.out.println("\nThe size of the Vector is "+vec.size());
    System.out.println("\nThe capacity of Vector is "+vec.capacity());
    System.out.println("\nThe first Element is "+vec.firstElement());
    System.out.println("\nThe last Element is "+vec.lastElement());
    System.out.println("\nThe Vector is "+vec);    
    System.out.println("\nThe index of 'is' "+vec.indexOf("is"));
    System.out.println("The Vector Contains "+vec.contains(5));
    System.out.println("The removed Vector is "+vec.remove("is"));
   }
}
