import java.util.Scanner;

class TravelDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter fromCity: ");
        String fromCity = sc.nextLine();

        System.out.print("Enter viaCity: ");
        String viaCity = sc.nextLine();

        System.out.print("Enter toCity: ");
        String toCity = sc.nextLine();

        System.out.print("Distance from " + fromCity + " to " + viaCity + " (miles): ");
        double fromToVia = sc.nextDouble();

        System.out.print("Distance from " + viaCity + " to " + toCity + " (miles): ");
        double viaToFinalCity = sc.nextDouble();

        System.out.print("Time from " + fromCity + " to " + viaCity + " (minutes): ");
        double timeFromToVia = sc.nextDouble();

        System.out.print("Time from " + viaCity + " to " + toCity + " (minutes): ");
        double timeViaToFinalCity = sc.nextDouble();

        double totalDistanceMiles = fromToVia + viaToFinalCity;
        double totalDistanceKm = totalDistanceMiles * 1.60934;   // miles to km
        double totalTime = timeFromToVia + timeViaToFinalCity;

        System.out.printf("The Total Distance travelled by %s from %s to %s via %s is %.2f km and the Total Time taken is %.0f minutes\n",
                name, fromCity, toCity, viaCity, totalDistanceKm, totalTime);
    }
}