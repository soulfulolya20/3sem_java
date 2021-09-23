public abstract class Dish {

    protected String color;
    protected String material;
    protected double radius;

    public Dish(String color, String material, double radius) {
        this.color = color;
        this.material = material;
        this.radius = radius;
    }

    public abstract double getTimeOfWash();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", radius=" + radius +
                '}';
    }
}
