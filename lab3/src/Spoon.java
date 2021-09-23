public class Spoon extends Dish {

    public Spoon(String color, String material, double radius){
        super(color, material, radius);
    }

    @Override
    public double getTimeOfWash() {
        return (radius * 1.0);
    }

    @Override
    public String toString() {
        return "Spoon{" +
                "color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", radius=" + radius +
                '}';
    }
}
