import java.util.Scanner;
public class DoubleOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a ");
        double a = sc.nextDouble();
        System.out.print("b ");
        double b = sc.nextDouble();
        System.out.print("c ");
        double c = sc.nextDouble();
        double op1 = a + b * c;
        double op2 = a * b + c;
        double op3 = c + a / b;
        double op4 = (int)a % (int)b + c;  
        System.out.println("The results of Double Operations are " + op1 + ", " + op2 + ", " + op3 + ", and " + op4);
        sc.close();
    }
}