import java.util.Scanner;
public class RectArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the width of the rectangle: ");
        double width = sc.nextDouble();

        System.out.print("Enter the height of the rectangle: ");
        double height = sc.nextDouble();

        double area = width * height;
        double perimeter = 2 * (width + height);

        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);
        sc.close();
        
    }
}
