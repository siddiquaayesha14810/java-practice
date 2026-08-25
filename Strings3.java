
//USING "charAt" FUNCTION :
import java.util.*;

public class Strings3 {
    public static void main(String args[]) {
        // concatenation
        String firstName = "tony";
        String LastName = "stark";
        String fullName = firstName + "@" + LastName;
        System.out.println(fullName.length());

        // charAt
        for (int i = 0; i < fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }
    }

}
