import java.util.Scanner;

class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheitResult = (celsius * 9 / 5) + 32;
        System.out.printf("The %.2f celsius is %.2f fahrenheit\n", celsius, fahrenheitResult);
    }
}