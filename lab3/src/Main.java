public class Main {
    public static void main(String[] args) {
        Mug c1 = new Mug("Белая", "Керамическая", 2.1);
        System.out.println(c1);
        System.out.println(c1.getColor());
        System.out.println(c1.getMaterial());
        System.out.println(c1.getRadius());
        System.out.print("Время мытья данной посуды занимает в секундах: ");
        System.out.println(c1.getTimeOfWash());

        Plate c2 = new Plate("Розовая", "Керамическая", 7.0);
        System.out.println(c2);
        System.out.println(c2.getColor());
        System.out.println(c2.getMaterial());
        System.out.println(c2.getRadius());
        System.out.print("Время мытья данной посуды занимает в секундах: ");
        System.out.println(c2.getTimeOfWash());

        Spoon c3 = new Spoon("Коричневая", "Деревянная", 1.1);
        System.out.println(c3);
        System.out.println(c3.getColor());
        System.out.println(c3.getMaterial());
        System.out.println(c3.getRadius());
        System.out.print("Время мытья данной посуды занимает в секундах: ");
        System.out.println(c3.getTimeOfWash());

        Pan c4 = new Pan("Серая", "Алюминиевая", 7.09);
        System.out.println(c4);
        System.out.println(c4.getColor());
        System.out.println(c4.getMaterial());
        System.out.println(c4.getRadius());
        System.out.print("Время мытья данной посуды занимает в секундах: ");
        System.out.println(c4.getTimeOfWash());

        Dish c5 = new Pan("Серая", "Алюминиевая", 4.4);
        System.out.println(c5);
        System.out.println(c5.getColor());
        System.out.println(c5.getMaterial());
        System.out.println(c5.getRadius());
        System.out.print("Время мытья данной посуды занимает в секундах: ");
        System.out.println(c5.getTimeOfWash());
    }
}
