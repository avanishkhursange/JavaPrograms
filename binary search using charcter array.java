import java.util.Arrays;
public class Demo {
    public static void main(String[] args) {
        char c_arr[] = { 'b', 's', 'l', 'e', 'm' };
        Arrays.sort(c_arr);
        System.out.print("The sorted array is: ");
        for (char i : c_arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        int index1 = Arrays.binarySearch(c_arr, 'e');
        System.out.println("The character e is at index " + index1);
        int index2 = Arrays.binarySearch(c_arr, 'z');
        System.out.println("The character z is at index " + index2);
    }
}