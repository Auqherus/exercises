import java.util.*;

class Simple_project1 {


    public static String CharCounts(String start) {


        String spaceString = "";
        boolean answer = false;
        int countWords = 0;
        int countSpaces = 0;
        int result = 0;

        for (int i = 0; i < start.length(); i++) {

            if(Character.isLetter(start.charAt(i)) && i != start.length()-1){
                answer = true;
            }
           else if(!Character.isLetter(start.charAt(i)) && answer){
               countWords++;
               answer = false;
           }
           else if(Character.isLetter(start.charAt(i)) && i == start.length()-1){
               countWords++;
            }
            if(start.charAt(i) == ' '){
                countSpaces++;
            }









        }

        System.out.println("Words :" +countWords);
        System.out.println("Spaces :" +countSpaces);


      /*  System.out.println(result);*/

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








