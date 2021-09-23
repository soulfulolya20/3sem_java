public class Main {
    public static void main(String[] args) {

        Priceable a1 = new Phone();
        System.out.println("Price of phone is: " + a1.getPrice() + " RUB");

        Priceable a2 = new Vegetable();
        System.out.println("Price of vegetable is: " + a2.getPrice() + " RUB");

        Car a3 = new Car();
        System.out.println("Price of car is: " + a3.getPrice() + " RUB");

    }
}
