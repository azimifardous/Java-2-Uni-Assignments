public class ShapeCalculator {
    double calculateArea(Rectangle r) {
        return r.calculateArea();
    }

    double calculateArea(Circle c) {
        return c.calculateArea();
    }

    double calculateVolume(Rectangle r, boolean isTrue) {
        return r.calculateVolume(isTrue);
    }

    double calculateVolume(Circle c) {
        return c.calculateVolume(true);
    }
}
