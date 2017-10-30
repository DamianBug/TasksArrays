/**
 * Created by Damian on 30.10.2017.
 */
public class TaskEight {

    static int sumRight(int[] array, int index){
        int sum = 0;
        for (int i = index + 1; i < array.length; i++){
            sum = sum + array[i];
        }
        return sum;
    }


    public static void main(String[] args){

        System.out.println(sumRight(new int[] {2, 4, 7, 8, 9}, 2));
    }
}
