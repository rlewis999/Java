import java.util.Scanner;

public class CalcSample {

    //decalre variables
    static String iName;    // employee name
    static int iHours;      // hpirs after conversation
    static double iRate;    // rate after conversation
    static double cNetPay;  // calculated pay
    static String oHours, oRate, oNetPay;    // after formatting for output
    static Scanner myScanner;   // input device

    public static void main(String[]args){

        //set scanner to the Console

        myScanner = new Scanner(System.in);

        //prompt for name
        System.out.println("Enter name:");
        iName = myScanner.nextLine();

        //prompt, input and convert hours
        System.out.println("Enter hours:");
        iHours = myScanner.nextInt();

        //prompt, input and covert rate
        System.out.println("Enter rate:");
        iRate = myScanner.nextDouble();

        //calculate pay
        cNetPay = iHours * iRate;

        //output wage data
        System.out.println("Wage information for " + iName +":" );
        System.out.println("\tHours:" + iHours);
        System.out.println("\tRate: " + iRate);
        System.out.println("\tNet pay: " + cNetPay);


        System.out.println("Prgram complete");
    }
}