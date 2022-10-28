import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 0, max = 0;
        boolean flag = true;
        while (true) {
            System.out.println("Enter a number:");
            if (scanner.hasNextInt()) {
                int temp = scanner.nextInt();

                if (flag) {
                    flag = false;
                    min = temp;
                    max = temp;
                }
                if (temp > max) {
                    max = temp;
                } else if (temp < min) {
                    min = temp;
                }
            } else {
                break;
            }
            scanner.nextLine(); // handles input
        }
        System.out.println("min = " + min + ", max = " + max);
        scanner.close();
    }
}
