package circleExericisePkg;

public class CircleExercise {
    public CircleExercise(){

    }

    public static void main(String[] args) {
        Circle circleOne = new Circle();

        circleOne.setRadius(10);
        System.out.println("El radio es: " + circleOne.toString());
        System.out.println("El área del círculo es: " + circleOne.getArea());
        System.out.println("La circunferencia del círculo es: " + circleOne.getCircumference());
    }
}
