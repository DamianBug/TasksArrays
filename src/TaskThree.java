/**
 * Created by Damian on 27.10.2017.
 */
public class TaskThree {

    public static void main(String[] args) {

        int[] numbers = {23, 4, 6, 8, 12, 23, 2, 1, 4, 6, 8, 10, 12, 2, 3, 4, 5, 6};

        int counter = 0;
        int value = 0;
        int counterMax = 0;

        for (int i = 0; i < numbers.length; i++) {
            counter = 0;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    value = numbers[i];
                    counter++;
                }
                if (counter > counterMax) {
                    counterMax = counter;
                }
            }
        }
        System.out.println("Najczęściej w tablicy występuje " + value);
    }
}
