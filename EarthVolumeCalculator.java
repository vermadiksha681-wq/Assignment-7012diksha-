// Write a Program to compute the volume of Earth in km^3 and miles^3
public class EarthVolumeCalculator {
    public static void main(String[] args) {
        double radiusKm = 6371.0;
        double radiusMiles = 3958.8;
        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);
        double volumeMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);
        System.out.printf("Volume of Earth:\n");
        System.out.printf("- In cubic kilometers (km³): %.2f km³\n", volumeKm3);
        System.out.printf("- In cubic miles (mi³): %.2f mi³\n", volumeMiles3);
    }
}

