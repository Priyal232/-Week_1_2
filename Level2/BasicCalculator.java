import java.util.Scanner;
public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("number1 ");
        double n1 = sc.nextDouble();
        System.out.print("number2 ");
        double n2 = sc.nextDouble();
        double add = n1 + n2, sub = n1 - n2, mul = n1 * n2, div = n1 / n2;
        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " + 
                          n1 + " and " + n2 + " is " + add + ", " + sub + ", " + mul + ", and " + div);
        sc.close();
    }
}