import java.util.Scanner;

public class Main {
    public static void printColorForPoint(double x, double y) {
        System.out.printf("(%.1f, %.1f) -> %s%n", x, y, Program.getColor(x, y));
    }
    public static void main(String[] args) {
        printColorForPoint(0, 0);
        printColorForPoint(5, 5);
        printColorForPoint(-2, -5);
        printColorForPoint(9, 3);
        printColorForPoint(4, 3);
        printColorForPoint(1.15, 2.2);
        printColorForPoint(-1, 1);
        printColorForPoint(0, -3);
        printColorForPoint(1, 0);
        printColorForPoint(-4, 0);
        printColorForPoint(0, -4);
        printColorForPoint(-1, -1);
        printColorForPoint(-5, -3);
        printColorForPoint(4, -1);
        System.out.print("Input x and y:");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        printColorForPoint(x, y);

    }
}

