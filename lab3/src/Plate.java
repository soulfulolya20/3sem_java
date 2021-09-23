public class Plate extends Dish {

    public Plate(String color, String material, double radius){
        super(color, material, radius);
    }

    @Override
    public double getTimeOfWash() {
        return (radius * 2.4);
    }

    @Override
    public String toString() {
        return "Plate{" +
                "color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", radius=" + radius +
                '}';
    }
}