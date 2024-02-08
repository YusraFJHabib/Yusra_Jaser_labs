import java.util.Scanner;

public class YusraJaser_PaintCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("My room needs painting, let's calculate what I will need.");
        System.out.print("Enter the length of the room in feet: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the room in feet: ");
        double width = scanner.nextDouble();
        System.out.print("Enter the height of the room in feet: ");
        double height = scanner.nextDouble();
        double wallArea = 2 * (length * height + width * height);
        double gallonsNeeded = wallArea / 350.0;
        double totalPrice = gallonsNeeded * 32.0;
        String gallonsFormatted = String.format("%.2f", gallonsNeeded);
        String totalPriceFormatted = String.format("%.2f", totalPrice);
        System.out.println("The number of gallons needed: " + gallonsFormatted);
        System.out.println("The total price to paint the room: $" + totalPriceFormatted);
        
        scanner.close();
    }
}