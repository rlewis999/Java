import java.util.Scanner;

public class Eggs {

    static class EggsINT

    {

        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);

            System.out.println("Enter number of eggs taken.");

            int AMOUNT=sc.nextInt();

            int doz=AMOUNT/12, unit=AMOUNT-doz*12;

            System.out.println("you ordered "+AMOUNT+" eggs. That's "+doz+" dozens plus "+unit+" eggs. That's $"+(doz*2.75+unit*0.35));

        }

    }
}
