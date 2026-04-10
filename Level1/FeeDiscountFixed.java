public class FeeDiscountFixed {
    public static void main(String[] args) {
        double fee = 125000, discPct = 10;
        double discount = fee * (discPct / 100);
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + (fee - discount));
    }
}