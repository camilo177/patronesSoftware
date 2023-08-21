package circleExericisePkg;
public class Circle {
    private double radius;
    //constructor
    public Circle(){
    }
    //Methods

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI* radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public String toString(){
        return String.valueOf(radius);
    }
}



