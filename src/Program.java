public class Program {
    // Соответствуют первому варианту задачи
    public static final Line L1 = new Line(0.5, -2, 5.33);
    public static final VerticalParabola P1 = new VerticalParabola(3, 2, 1.0 / 8);
    public static final VerticalParabola P2 = new VerticalParabola(5, 4, -1.0 / 8);
    public static final VerticalParabola P3 = new VerticalParabola(-4, 2, -1.0 / 4);
    public static final Circle C1 = new Circle(-2, 0, 4);

    public static SimpleColor getColor(double x, double y) {
        if (P1.isPointAboveOfParabola(x, y) && !C1.isInsideOfCircle(x, y) && P2.isPointAboveOfParabola(x, y)) {
            return SimpleColor.ORANGE;
        }
        if (C1.isInsideOfCircle(x, y) && L1.isPointAboveLine(x, y) && !P2.isPointAboveOfParabola(x, y) &&
                P3.isPointAboveOfParabola(x, y)) {
            return SimpleColor.ORANGE;
        }
        if (L1.isPointAboveLine(x, y) && !C1.isInsideOfCircle(x, y) && !P2.isPointAboveOfParabola(x, y)) {
            return SimpleColor.ORANGE;
        }
        if (x > 5 && y > 0 && !C1.isInsideOfCircle(x, y) && !P1.isPointAboveOfParabola(x, y) &&
                P2.isPointAboveOfParabola(x, y)) {
            return SimpleColor.ORANGE;
        }
        if (C1.isInsideOfCircle(x, y) && P2.isPointAboveOfParabola(x, y) && P3.isPointAboveOfParabola(x, y) &&
                L1.isPointAboveLine(x, y) && !P1.isPointAboveOfParabola(x, y)) {
            return SimpleColor.GREEN;
        }
        if (C1.isInsideOfCircle(x, y) && !L1.isPointAboveLine(x, y) && !P2.isPointAboveOfParabola(x, y) &&
                !P3.isPointAboveOfParabola(x, y)) {
            return SimpleColor.GREEN;
        }
        if (C1.isInsideOfCircle(x, y) && !L1.isPointAboveLine(x, y) && !P2.isPointAboveOfParabola(x, y) &&
                P3.isPointAboveOfParabola(x, y)) {
            return SimpleColor.GRAY;
        }
        if (C1.isInsideOfCircle(x, y) && !P3.isPointAboveOfParabola(x, y) && P2.isPointAboveOfParabola(x, y)) {
            return SimpleColor.GRAY;
        }
        if (!C1.isInsideOfCircle(x, y) && !P3.isPointAboveOfParabola(x, y) && !P2.isPointAboveOfParabola(x, y) &&
            !L1.isPointAboveLine(x, y)) {
            return SimpleColor.GRAY;
        }
        if (C1.isInsideOfCircle(x, y) && L1.isPointAboveLine(x, y) && !P2.isPointAboveOfParabola(x, y) &&
                !P3.isPointAboveOfParabola(x, y)) {
            return SimpleColor.BLUE;
        }
        if (!C1.isInsideOfCircle(x, y) && !P3.isPointAboveOfParabola(x, y) && P2.isPointAboveOfParabola(x, y)) {
            return SimpleColor.BLUE;
        }
        if (!C1.isInsideOfCircle(x, y) && P3.isPointAboveOfParabola(x, y) && !P2.isPointAboveOfParabola(x, y) &&
            !L1.isPointAboveLine(x ,y) && !P1.isPointAboveOfParabola(x, y)) {
            return SimpleColor.BLUE;
        }
        if (P1.isPointAboveOfParabola(x, y) && !P2.isPointAboveOfParabola(x, y)) {
            return SimpleColor.YELLOW;
        }
        if (C1.isInsideOfCircle(x, y) && !L1.isPointAboveLine(x, y) && P2.isPointAboveOfParabola(x, y)) {
            return SimpleColor.YELLOW;
        }
        return SimpleColor.WHITE;
    }
}