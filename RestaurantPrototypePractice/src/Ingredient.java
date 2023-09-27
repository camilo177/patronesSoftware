interface Ingredient{
    Ingredient clone();
}

class Pizza implements Ingredient{
    private double price;
    private double weight;

    private String name;

    public Pizza(double price, double weight, String name){
        this.price = price;
        this.weight = weight;
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public Ingredient clone() {
        return new Pizza(this.price, this.weight, this.name);
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "price=" + price +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }
}