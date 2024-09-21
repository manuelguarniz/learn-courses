import java.util.Scanner;

class Rectangle {
    private int width;
    private int height;
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public int getArea() {
        return width * height;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = scanner.nextInt();
        int height = scanner.nextInt();
        Rectangle rectangle = new Rectangle(width, height);

        int width2 = scanner.nextInt();
        int height2 = scanner.nextInt();
        Rectangle rectangle2 = new Rectangle(width2, height2);

        System.out.println(rectangle.getArea());
        System.out.println(rectangle2.getArea());

    }
}
