import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        final double PI = 3.1415926;
        double length;
        double radius;
        Scanner input = new Scanner(System.in);
        radius = input.nextDouble();
        length = radius * 2 * PI;
        System.out.println ("Длинна окружности с радиусом " + radius + "равна: " + length);
        // ...
    }
}

I'ts sunday my dudes