import java.util.Scanner;

/**
 * Created by Damian on 26.10.2017.
 */
public class TaskOne {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wielkość tablicy:");
        int n = scanner.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }
        for (int j = array.length - 1; j > 0; j--){
            System.out.print(" "+array[j]);
        }
    }
}
