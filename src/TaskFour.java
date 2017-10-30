import java.util.Scanner;

/**
 * Created by Damian on 27.10.2017.
 */
public class TaskFour {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wielkość tablicy:");
        int n = scanner.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }

        int value = 0;
        int counter = 1;
        int counterMax = 1;
        int indexMax = 0;

        for (int i = 1; i < array.length; i++){
            if (array[i] == array[value]){
                counter++;
            }
            if (counter > counterMax){
                counterMax = counter;
                indexMax = i - 1;
            }
            if (array[i] == array[value]){
                counter++;
            }else {
                value = 1;
                counter = 1;
            }
            System.out.println(indexMax+" "+value);
        }
        System.out.println(array[indexMax]+" występuje "+counterMax+" razy");
    }
}
