package bibliotecaPkg;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        // Crear objetos de tipo editorial
        Libro libro1 = new Libro("L001", "Java Programming", 2020, false);
        Libro libro2 = new Libro("L002", "Python", 2019, false);
        Revista revista1 = new Revista("R001", "Ciencia hoy", 2022, 5);

        System.out.println("Libro 1");
        libro1.devolveranoPublicacion();
        libro1.devolverCodigo();

        System.out.println("Libro 2 no está prestado");
        System.out.println("Método prestado: ");
        libro2.prestado();
        System.out.println(libro2.isPrestado());
        System.out.println("Método prestar: ");
        libro2.prestar();
        System.out.println(libro2.isPrestado());
        libro2.devolver();
        System.out.println("Método devolver: ");
        System.out.println(libro2.isPrestado());

        System.out.println("Revista: ");
        revista1.devolveranoPublicacion();
        revista1.devolverCodigo();
    }
}

