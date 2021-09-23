public class Mug extends Dish {

    public Mug(String color, String material, double radius){
        super(color, material, radius);
    }

    @Override
    public double getTimeOfWash() {
        return (radius * 2.0);
    }

    @Override
    public String toString() {
        return "Mug{" +
                "color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", radius=" + radius +
                '}';
    }
}
