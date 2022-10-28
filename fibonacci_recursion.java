import java.util.*;

public class fibonacci_recursion{
    public static int fib(int n){
        if (n == 0 || n == 1) {
            return n;
        }

        return fib(n - 1) + fib(n - 2);
    }    
    
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the a number 'n' to find the n-th term on the Fibonacci sequence: ");
        int n = sc.nextInt();
        System.out.println(fib(n));
    }
}