
//DEFINING AN ARRAY [2]
//TYPE[]ARRAYNAME = {1,2,3,4,5,6}
import java.util.*;

public class Arrays2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i]);
        }
    }

}
