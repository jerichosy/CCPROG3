import java.util.*;

public class JustMeNow 
{
    public static void main (String[] args) 
    {
        int percent = 25, quantity;
        double amount;
        String item;
        Scanner sc = new Scanner(System.in);

        System.out.print("Input unit price: ");
        amount = sc.nextDouble();

        // sc.nextLine();
        System.out.print("Input amount: ");
        quantity = sc.nextInt();

        sc.nextLine();
        System.out.print("Input item name: ");
        item = sc.nextLine();

        System.out.println(quantity + " " + item + " @" + amount);
        System.out.println("    Less " + percent + "% = " + amount * ((100-percent)/100.0));
        System.out.println("Total Due: PhP " + amount * ((100-percent)/100.0) * quantity);

        sc.close();
    }
}
