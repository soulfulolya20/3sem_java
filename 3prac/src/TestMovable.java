public class TestMovable {
    public static void main(String[] args) {
        Movable ob1 = new MovablePoint(4, 2, 10, 5);
        System.out.println(ob1);
        ob1.moveRight();
        ob1.moveDown();
        ob1.moveUp();
        System.out.println(ob1);

        Movable ob2 = new MovableCircle(2, 6, 77, -11, 10);
        System.out.println(ob2);
        ob2.moveRight();
        ob2.moveDown();
        System.out.println(ob2);

        MovableRectangle ob3 = new MovableRectangle(2, 6, 77, -11, 10, 32);
        System.out.println(ob3);
        ob3.moveRight();
        ob3.moveDown();
        System.out.println(ob3);
        System.out.println(ob3.isEqualSpeed());
    }
}