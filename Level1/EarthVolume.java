public class EarthVolume {
    public static void main(String[] args) {
        double r = 6378, pi = Math.PI;
        double volKm3 = (4.0/3) * pi * Math.pow(r, 3);
        double volMi3 = volKm3 / Math.pow(1.6, 3);
        System.out.println("The volume of earth in cubic kilometers is " + volKm3 + 
                          " and cubic miles is " + volMi3);
    }
}