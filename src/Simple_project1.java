import java.util.*;
import java.math.BigInteger;

class Simple_project1 {


    public static String CharCounts(String start) {

        StringBuilder sd = new StringBuilder(start);
        String o = "";

        for (int i = 0; i < sd.length(); i++) {
            int count = 0;
            char x = sd.charAt(0);


            while(sd.indexOf(x+"") != -1) {
                sd.deleteCharAt(sd.indexOf(x+""));
               /* System.out.println(start.charAt(i) + o + i);*/

                count++;

            }

            o = o+x+count;
        }

        return o;
    }


    public static void main(String[] args) {

        Scanner TryMe = new Scanner(System.in);

        while (true) {
            System.out.print("Put string of letters here to count(ex.'aaabfrtd') :" + " ");
            String s = TryMe.nextLine();
            if (s.equals("stop")) {
                break;
            }
            System.out.println("Result is :" + " " + CharCounts(s));

        }
    }
}








