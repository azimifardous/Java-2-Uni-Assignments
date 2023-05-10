public class Rectangle extends Shape {
    private int length;
    private int width;
    public Rectangle(int l, int w) {
        super();
        this.length = l;
        this.width = w;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculateVolume(boolean isTrue) {
        if (isTrue)
            return (length * length * length);
        else
            return (width * width * width);
    }
}
