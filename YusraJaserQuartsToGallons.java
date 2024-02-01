public class YusraJaserQuartsToGallons {
    public static void main(String[] args) {

        int Quarts = 18;

        int Gallons = Quarts / QUARTS_TO_GALLON;
        int remainingQuarts = Quarts % QUARTS_TO_GALLON;

        System.out.println("For a painting job that needs " + Quarts + " quarts:");
        System.out.println("You'll need " + Gallons + " gallons, plus " + remainingQuarts + " quarts.");
    }
}
