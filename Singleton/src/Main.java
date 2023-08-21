public class Main {
    public static void main(String[] args) {
        //printer 1 and 2 represent print jobs sent to the same virtual printer (instance)
        Printer printer1 = Printer.getInstance();
        Printer printer2 = Printer.getInstance();

        printer1.print("Classified document 1 is printing......");
        printer2.print("Classified document 2 is printing ......");
        if (printer1 == printer2) {
            System.out.println("TRUE APPLICATION OF CONCEPT");
        } else {
            System.out.println("FALSE APPLICATION OF CONCEPT");//Proof of design pattern application
        }
    }
}
