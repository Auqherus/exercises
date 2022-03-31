import java.math.BigInteger;
import java.util.Scanner;

public class Simple_project1 {

    public static void main(String [] args){
        try (Scanner TryMe = new Scanner(System.in)) {


            while (true) {
                System.out.println("Wcisnij Q, by zakonczyc, Enter, by kontynuowac...");
                String q = TryMe.next();

                if (q.equals("q") || q.equals("Q")) {
                    break;
                }

                System.out.print("Podaj a :");
                BigInteger a = TryMe.nextBigInteger();
                System.out.print("Podaj b :");
                BigInteger b = TryMe.nextBigInteger();


                Counter c1 = new Counter(a, b);
                c1.getCalculation();
                System.out.println("A=" + c1.getA() + " " + "B=" + c1.getB());
            }
        }
    }
}

class Counter {
    private BigInteger a,b;
    public Counter(){} // Not in use Constructor
    public Counter(BigInteger a, BigInteger b){this.a = a;this.b = b;}
    public BigInteger getA() {return a;} public BigInteger getB() {return b;}
    public void getCalculation(){
        BigInteger BigNumberA = new BigInteger(String.valueOf(a));
        BigInteger BigNumberB = new BigInteger(String.valueOf(b));
        if(true) {System.out.println("Wynik ="+" "+a+"+"+b+"="+BigNumberA.add(BigNumberB));}}}
