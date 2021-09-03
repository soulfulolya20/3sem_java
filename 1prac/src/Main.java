public class Main {
    public static void main(String[] args) {
        Dog ob1 = new Dog("Майк", 2);
        Dog ob2 = new Dog("Звёздочка", 7);
        Dog ob3 = new Dog("Тузик", 3);
        ob1.get_info();
        ob2.get_info();
        ob3.get_info();
        System.out.println(ob1);
    }
}