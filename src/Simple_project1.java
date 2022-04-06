import java.util.*;
import java.io.*;

class Simple_project1 {


        public static String FirstReverse (String str) {
            // code goes here
            String reverse = "";
            for (int i =str.length()-1; i>=0 ; i--) {
                reverse = reverse+str.charAt(i);
            }

            return reverse;
        }

        public static void main (String[]args){
            // keep this function call here
            Scanner s = new Scanner(System.in);
            System.out.print("Put a word to reverse :" +" ");
            System.out.print("Result :"+" "+FirstReverse(s.nextLine()));
        }
    }
