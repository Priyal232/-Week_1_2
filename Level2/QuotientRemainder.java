import java.util.Scanner;
public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("number1 ");
        int n1 = sc.nextInt();
        System.out.print("number2 ");
        int n2 = sc.nextInt();
        int quotient = n1 / n2;
        int remainder = n1 % n2;
        System.out.println("The Quotient is " + quotient + " and Reminder is " + remainder + " of two number " + 
                          n1 + " and " + n2);
        sc.close();
    }
}