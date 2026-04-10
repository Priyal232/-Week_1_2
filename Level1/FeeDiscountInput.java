import java.util.Scanner;
public class FeeDiscountInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("fee ");
        double fee = input.nextDouble();
        System.out.print("discountPrecent ");
        double discPct = input.nextDouble();
        double discount = fee * (discPct / 100);
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + (fee - discount));
        input.close();
    }
}