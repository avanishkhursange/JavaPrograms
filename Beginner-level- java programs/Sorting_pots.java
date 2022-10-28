import java.util.Arrays;

public class Sorting_pots {

    public static void main(String[] args) {

        int temp;
        int pots[] = {23, 18, 4, 16, 9, 21, 14};

        for (int i = 0; i < (pots.length - 1); i++) {
            for (int j = 0; j < pots.length - 1 - i; j++) {

                if (pots[j + 1] < pots[j]) {
                       temp = pots[j];

                    pots[j] = pots[j + 1];
                    pots[j + 1] = temp;
                }
            }
        }

        System.out.println("\n Sorted pots: " + Arrays.toString(pots));

    }
}
