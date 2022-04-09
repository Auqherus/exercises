import java.util.*;
import java.math.BigInteger;

class Simple_project1 {


    public static String CharCounts(String start) {

        StringBuilder sd = new StringBuilder(start);
        String spaceString = "";

        for (int i = 0; i <= sd.length(); i++) {
            int counter = 0;
            char charNumber = sd.charAt(0);   // ustaw w metodzie StringBuilder sd charNumber na 0 indeks


            while(sd.indexOf(charNumber+"") != -1) {
                sd.deleteCharAt(sd.indexOf(charNumber+""));    // usun po zliczeniu litere spaceString podanym indeksie(czyli zerowym)
               /* System.out.println(start.charAt(i) + spaceString + i);*/

                counter++;


            }
            System.out.println(spaceString+"Letter:"+charNumber+" Times: "+counter);


        }


        return spaceString;
    }


    public static void main(String[] args) {

        Scanner TryMe = new Scanner(System.in);

        while (true) {
            System.out.print("Put string of letters here to count(ex.'aaabfrtd') :" + " ");
            String s = TryMe.nextLine();
            if (s.equals("stop")) {
                break;
            }
           CharCounts(s);

        }
    }
}








