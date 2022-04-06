import java.util.*;
import java.io.*;

class Simple_project1 {


    public static int FirstFactorial(int num) {
        // code goes here


        int result = 1;
        for (int i = 1; i <= num; i++) {

            result =result * i;

        }

        return result;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print("Put a number here : ");
        System.out.print("Total : "+ " "+FirstFactorial(Integer.parseInt(s.nextLine())));
    }

}