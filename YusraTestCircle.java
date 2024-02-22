public class YusraTestCircle {
    public static void main(String[] args) {
        YusraCircle circle1 = new YusraCircle();
        YusraCircle circle2 = new YusraCircle();

        circle1.setRadius(2); 

        System.out.println("Circle 1:");
        System.out.println("Radius: " + circle1.getRadius());
        System.out.println("Diameter: " + circle1.getDiameter());
        System.out.println("Area: " + circle1.getArea());
        System.out.println();

        System.out.println("Circle 2:");
        System.out.println("Radius: " + circle2.getRadius());
        System.out.println("Diameter: " + circle2.getDiameter());
        System.out.println("Area: " + circle2.getArea());
    }
}
