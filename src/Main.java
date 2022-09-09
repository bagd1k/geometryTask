public class Main {
    public static void printColorForPoint(double x, double y) {
        System.out.printf("(%f, %f) -> %s%n", x, y, Program.getColor(x, y));
    }
    public static void main(String[] args) {
        for (int x = -10; x < 11; ++x)
            for (int y = -10; y < 11; ++y)
                printColorForPoint(x, y);

    }
}

