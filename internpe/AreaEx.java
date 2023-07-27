import java.util.Scanner;
public class AreaEx {
    public static void main(String a[]){
        double pi=3.14;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        double area = pi * radius * radius;
        double perimeter = 2 * pi * radius;
        System.out.println("areais ="+area);
        System.out.println("perimeter is ="+perimeter);
        sc.close();
    }
}
