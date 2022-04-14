import java.util.Scanner;

public class Simple_project1 {


    public static String CharCounts(String start) {

        int endOfLine = start.length();

        int counter = 0;
        boolean ifTrue = true;
        String result = "";
        int k = 0;

        for (int i = 0; i < endOfLine; i++) {

            char a = start.charAt(i);
            k = 1;

            for (int j = 0; j < i; j++) {

                char b = start.charAt(j);
                if (a == b && i!= start.length()) {
                    k++;
                }

            }

            result = result + a + k;
        }

            return result;
        }


        public static void main (String[]args){

            Scanner TryMe = new Scanner(System.in);
            System.out.print("Wpisz przykladowe zdanie :" + " ");
            System.out.println(CharCounts(TryMe.nextLine()));

        }
    }
