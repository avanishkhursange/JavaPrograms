import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        int rows = sc.nextInt();
        sc.close();
        for (int i = 1; i <= rows; ++i) {

            for (int j = 1; j <= i; ++j) {

                System.out.print(j + " ");

            }

            System.out.println();

        }

    }

}
