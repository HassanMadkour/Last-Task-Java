
import java.util.Scanner;

class Circle {
    private Double radius;
    private String Color;

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public Circle(Double radius, String color) {
        this.radius = radius;
        Color = color;
    }

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + ", Color=" + Color + "]";
    }
}

class Cylinder extends Circle {
    private Double height;

    public double getVolume() {
        return this.height * getArea();
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Cylinder(Double radius, String color, Double height) {
        super(radius, color);
        this.height = height;
    }

    public Cylinder(Double radius, Double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(Double height) {
        this.height = height;
    }

    public Cylinder() {
    }

}

public class Cir_Cyl {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Cylinder obj = new Cylinder();
        Circle obj1 = new Circle();
        int x = 0;
        do {
            System.out.print("\n(1)Circle \t (2)Cylinder \t UR Choice :");
            switch (in.nextLine()) {
                case "1":
                    System.out.print("Enter radius :");
                    obj1.setRadius(in.nextDouble());
                    in.nextLine();
                    System.out.print("Enter Color :");
                    obj1.setColor(in.nextLine());
                    System.out.println("\nArea : " + obj1.getArea() + "\t Color : " + obj1.getColor());

                    break;
                case "2":
                    System.out.print("Enter radius :");
                    obj.setRadius(in.nextDouble());
                    in.nextLine();
                    System.out.print("Enter Color :");
                    obj.setColor(in.nextLine());
                    System.out.print("Enter Height :");
                    obj.setHeight(in.nextDouble());
                    System.out.println("\nArea : " + obj.getArea() + "\t Color : " + obj.getColor() + "\t Volume : "
                            + obj.getVolume());

                    break;
                default:
                    System.out.println("Must choice 1 or 2");

            }
            System.out.print("(1)agine  : ");
            x = in.nextInt();
            in.nextLine();
        } while (x == 1);
        in.close();

    }
}