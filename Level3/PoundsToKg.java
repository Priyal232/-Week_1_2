import java.util.Scanner;

class PoundsToKg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weight = sc.nextDouble();
        double kg = weight * 0.453592; // 1 pound ≈ 0.453592 kg (more accurate)

        System.out.printf("The weight of the person in pounds is %.2f and in kg is %.2f\n", weight, kg);
    }
}