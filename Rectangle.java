public class Rectangle {

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getPerimeter() {
        return 2 * (width + height);
    }

    public int getArea() {
        return width * height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Chiều rộng: " + rectangle.getWidth());
        System.out.println("Chiều cao: " + rectangle.getHeight());
        System.out.println("Chu vi: " + rectangle.getPerimeter());
        System.out.println("Diện tích: " + rectangle.getArea());
        
    }
}
