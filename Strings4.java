
// IN THIS WE ARE COMPARING "TWO STRINGS" 
import java.util.*;

public class Strings4 {
    public static void main(String args[]) {
        // comparing two strings
        String name1 = "Tony";
        String name2 = "Tony2";

        // 1 s1 > s2 : +ve value
        // s1 = s2 : 0
        // 2 s1 < s2 : -ve value

        if (name1.compareTo(name2) == 0) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }

}
