// Program Name: RectangleCalculation
// Purpose: Calculate area and perimeter of a rectangle

class RectangleCalculation {
    public static void main(String[] args) {

        // Variables
        double length = 10.5;
        double width = 5.2;

        // Calculations
        double area = length * width;
        double perimeter = 2 * (length + width);

        // Display results
        System.out.println("Rectangle Details:");
        System.out.println("Length = " + length);
        System.out.println("Width = " + width);
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }
}