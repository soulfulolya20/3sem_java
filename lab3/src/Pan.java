public class Pan extends Dish {

    public Pan(String color, String material, double radius){
        super(color, material, radius);
    }

    @Override
    public double getTimeOfWash() {
        return (radius * 8.0);
    }

    @Override
    public String toString() {
        return "Pan{" +
                "color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", radius=" + radius +
                '}';
    }
}
