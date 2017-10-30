import java.util.Scanner;

/**
 * Created by Damian on 27.10.2017.
 */
public class TaskSix {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wielkość tablicy:");
        int n = scanner.nextInt();
        int max = 0;


        int[] array = new int[n];
        for (int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }
        int min = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
            if (array[i] < min){
                min = array[i];
            }
        }
        System.out.println("Wartość maksymalna w tablicy to "+max);
        System.out.println("Wartość minimalna w tablicy to "+min);
    }
}
