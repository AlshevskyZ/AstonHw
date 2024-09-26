package task2;
public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3.2, 4.3, "Желтый", "Зеленый");
        Triangle triangle = new Triangle(4.5, 4.5, 2.8, "Белый", "Синий");
        Circle circle = new Circle(32.8, "Черный", "Красный");
        System.out.println(rectangle);
        System.out.println(triangle);
        System.out.println(circle);
    }
}
