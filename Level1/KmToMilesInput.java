import java.util.Scanner;
public class KmToMilesInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("km ");
        double km = input.nextDouble();
        System.out.println("The total miles is " + (km / 1.6) + " mile for the given " + km + " km");
        input.close();
    }
}