package bibliotecaPkg;

public class Libro extends Editorial implements IPrestable{
    private boolean prestado;

    public Libro(String codigo, String titulo, double anoPublicacion, boolean prestado) {
        super(codigo, titulo, anoPublicacion);
        this.prestado = prestado;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "codigo='" + getCodigo() + '\'' +
                ", titulo='" + getTitulo() + '\'' +
                ", anoPublicacion=" + getAnoPublicacion() +
                ", prestado=" + prestado +
                '}';
    }

    //Implementación de interfaz
    @Override
    public boolean prestar() {
        if (!prestado) {
            prestado = true;
            return true;
        }
        return false;
    }

    @Override
    public boolean devolver() {
        if (prestado) {
            prestado = false;
            return true;
        }
        return false;
    }

    @Override
    public boolean prestado() {
        return prestado;
    }
}
