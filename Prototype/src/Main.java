import java.util.*;

//Interface Prototype
interface Shape {
    Shape clone();
    void draw();
}


//Class implementing prototype shape (in inheritance it extends)
class Circle implements Shape{
    private int radius;

    public Circle(int radius){
        this.radius = radius;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    @Override
    public Shape clone(){
        return new Circle(this.radius);
    }
    @Override
    public void draw(){
        System.out.println("Drawing a circle with radius: " + radius);
    }

}

public class Main {
    public static void main(String[] args) {
        //Create object of circle
        Shape originalCircle = new Circle(5);

        //Clone object from "originalCircle"
        Shape clonedCircle = originalCircle.clone();

        //draw from object cloned
        clonedCircle.draw();

        //Modify radius from object cloned
        ((Circle) clonedCircle).setRadius(8);
        clonedCircle.draw();
    }
}