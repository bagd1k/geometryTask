public class Program {
    // Соответствуют первому варианту задачи
    public static final Line L1 = new Line(2, 6, 1.0 / 4);
    public static final VerticalParabola P1 = new VerticalParabola(3, 2, 1.0 / 3);
    public static final VerticalParabola P2 = new VerticalParabola(5, 4, 1);
    public static final VerticalParabola P3 = new VerticalParabola(-5, 2, 1);
    public static final Circle C1 = new Circle(-4, 0, 4);

    double x = -2;
    double y = 2;
    public static SimpleColor getColor(double x, double y) {
//        if (C1.isInsideOfCircle(x, y)) {
//            return SimpleColor.GREEN;
//        }
        if (P1.isPointAboveOfParabola(x, y)) {
            return SimpleColor.ORANGE;
        }
        return SimpleColor.WHITE;
    }
}