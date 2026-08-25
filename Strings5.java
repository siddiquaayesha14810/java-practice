
// HOW TO DECLARE STRINGBUILDER , USING CHARAT INDEX , SET CHARAT INDEX :
import java.util.*;

public class Strings5 {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        // charAt index 0
        System.out.println(sb.charAt(0));

        // set charAt index 0
        sb.setCharAt(0, 'p');
        System.out.println(sb);
    }

}
