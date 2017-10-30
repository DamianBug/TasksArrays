/**
 * Created by Damian on 30.10.2017.
 */
public class TaskSeven {

    static int sumLeft(int[] array, int index){
        int sum = 0;
        for (int i = 0; i < index; i++){
            sum = sum + array[i];
        }
        return sum;
    }


    public static void main(String[] args){

        System.out.println(sumLeft(new int[]{2, 4, 5, 7, 8}, 2 ));
    }
}
