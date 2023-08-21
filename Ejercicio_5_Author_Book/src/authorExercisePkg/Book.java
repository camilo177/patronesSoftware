package authorExercisePkg;

public class Book extends Author {
    private String title;
    private double price;
    private int qty;

    public Book(){
        //Constructor
    }
    //Methods

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book: " + getTitle() + " - Author´s info" + " -name: "  + getName() + " -email: " + getEmail() +
                " -gender: " + getGender() + ", price:" + getPrice() + ", quantity: " + getQty();
    }
}
