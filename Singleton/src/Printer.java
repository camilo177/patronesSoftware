public class Printer {
    //only one instance of a virtual printer that handles all printing tasks will be created
    private static Printer instance = null;
    private Printer() {
        // Constructor private
    }
    // Method static to get instance
    public static Printer getInstance() {
        if (instance == null) {
            instance = new Printer();
        }
        return instance;
    }

    //Method void for printing message
    public void print(String document) {
        System.out.println("Printing: " + document);
    }
}



