
//TAKE AN ARRAY A SINPUT FROM THE USER SEARCH FOR A GIVEN NUMBER "X" AND PRINT THE INDEX AT WHICH IT OCCUR ?

import java.util.*;
public class Arrays3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in) ;
        int size = sc.nextInt();
        int numbers[] = new int[size];

        //input
        for(int i = 0; i < size; i ++) {
            numbers[i] = sc.nextInt();
        }

        int x = sc.nextInt() ;

        //output
        for(int i = 0; i < numbers.length; i ++) {
            if(numbers[i] == x) {
                System.out.println("x found at index : " + i);
            }
        }
    }

            


    
}
