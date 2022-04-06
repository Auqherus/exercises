import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Simple_project1 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter start time (HH:mm aa): ");
        String starttime = input.nextLine();

        System.out.print("Enter end time (HH:mm aa): ");
        String endtime = input.nextLine();

//HH converts hour in 24 hours format (0-23), day calculation
        SimpleDateFormat format = new SimpleDateFormat("HH:mm aa");

        Date d1 = null;
        Date d2 = null;

        try {
            d1 = format.parse(starttime);
            d2 = format.parse(endtime);

            //in milliseconds
            long diff = d2.getTime() - d1.getTime();

            long diffSeconds = diff / 1000 % 60;
            long diffMinutes = diff / (60 * 1000) % 60;

            System.out.print(diffMinutes + " minutes and " + diffSeconds + " seconds.");
        } catch (Exception e) {
            System.out.println("Invalid fromat");
        }
    }
}

