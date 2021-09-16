public class Circle {
    public double radius;
    public double per;
    public double square;

    public double getPer(){
        return per;
    }

    public double getSquare() {
        return square;
    }

    public void setPer(double radius){
        per = 2*Math.PI*radius; // длина окружности = 2*p*r
    }

    public void setSquare(double radius) {
        square = Math.pow(radius, 2.0) * Math.PI; // площадь круга = r^2*p
    }
}