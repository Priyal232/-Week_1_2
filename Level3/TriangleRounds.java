import java.util.Scanner;

class TriangleRounds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side1 (meters): ");
        double side1 = sc.nextDouble();
        System.out.print("Enter side2 (meters): ");
        double side2 = sc.nextDouble();
        System.out.print("Enter side3 (meters): ");
        double side3 = sc.nextDouble();

        double perimeter = side1 + side2 + side3;
        double totalDistance = 5000; // 5 km = 5000 meters
        double rounds = totalDistance / perimeter;

        System.out.printf("The total number of rounds the athlete will run is %.2f to complete 5 km\n", rounds);
    }
}