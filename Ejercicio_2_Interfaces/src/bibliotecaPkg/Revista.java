package bibliotecaPkg;

public class Revista extends Editorial{
    private int numero;

    public Revista(String codigo, String titulo, double anoPublicacion, int numero) {
        super(codigo, titulo, anoPublicacion);
        this.numero = numero;
    }

    //Getters y setters

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Revista{" +
                "codigo='" + getCodigo() + '\'' +
                ", titulo='" + getTitulo() + '\'' +
                ", anoPublicacion=" + getAnoPublicacion() +
                ", numero=" + numero +
                '}';
    }


}
