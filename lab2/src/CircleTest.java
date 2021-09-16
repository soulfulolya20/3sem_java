import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        double radius;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите радиус окружности:");
        radius = scan.nextDouble(); //считать вещественное число из командной строки
        Circle object = new Circle();
        object.setPer(radius);
        object.setSquare(radius);
        System.out.println("Длина окружности:");
        System.out.println(object.getPer());
        System.out.println("Площадь круга:");
        System.out.println(object.getSquare());
    }
}
