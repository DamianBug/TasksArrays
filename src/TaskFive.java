/**
 * Created by Damian on 27.10.2017.
 */
public class TaskFive {

    public static void main(String[] args){

        int[] numbers = { 23, 4, 6, 7, 8, 12, 3, 33, 44, 45, 67, 80, 90};

        int sum = 0;
        int average = 0;

        for (int numb : numbers){
            sum = sum + numb;
        }

        average = sum/numbers.length;
        System.out.println("Suma ciągu wynosi "+sum);
        System.out.println("średnia arytmetyczna wynosi "+average);
    }
}
