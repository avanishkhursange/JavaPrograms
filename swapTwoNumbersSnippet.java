public class swapTwoNumbersSnippet {

  /**
   * Swapping Two Numbers without using third variable using bit manipulation algorithm.
   *
   * @param arr array to sort
   * @return the missing element from the array
   */

    public static void main(String a[]) {
        int x = 10;
        int y = 5;
      
        System.out.println("Before swap: x = "
                           + x + ", y = " + y);
      
        x = x ^ y; 
        y = x ^ y; 
        x = x ^ y;
 
        System.out.println("After swap: x = "
                           + x + ", y = " + y);
    }
}
