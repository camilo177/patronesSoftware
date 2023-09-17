public class Main {
    public static void main(String[] args) {

        Ingredient originalPizza = new Pizza(20, 10, "Hawaiana");

        Ingredient clonedPizza = originalPizza.clone();

        ((Pizza) clonedPizza).setName("Mexican");
        ((Pizza) clonedPizza).setPrice(10);
        ((Pizza) clonedPizza).setWeight(20);

        System.out.println(originalPizza);
        System.out.println(clonedPizza);
    }
}
