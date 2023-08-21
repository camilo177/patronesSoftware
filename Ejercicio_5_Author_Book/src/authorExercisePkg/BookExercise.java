package authorExercisePkg;

public class BookExercise {
    public BookExercise(){
    }

    public static void main(String[] args) {
        Book bookOne = new Book();

        bookOne.setPrice(12000);
        bookOne.setQty(5);
        bookOne.setTitle("The Lord of the Rings");
        bookOne.setName("Tolkien");
        bookOne.setGender('m');
        bookOne.setEmail("tolkien@whatever.com");

        System.out.println((bookOne.toString()));
    }
}
