public class Circle extends Shape{
    private int radius;
    public Circle(int r) {
        super();
        this.radius = r;
    }

    @Override
    public double calculateArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public double calculateVolume(boolean isTrue) {
        return radius * radius * radius;
    }
}
