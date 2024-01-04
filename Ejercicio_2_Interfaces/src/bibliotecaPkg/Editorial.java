package bibliotecaPkg;

public class Editorial {
    private String codigo;
    private String titulo;
    private double anoPublicacion;

    public Editorial(String codigo, String titulo, double anoPublicacion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anoPublicacion = anoPublicacion;
    }

    //Getters y setters

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getAnoPublicacion() {
        return anoPublicacion;
    }

    public void setAnoPublicacion(double anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }

    @Override
    public String toString() {
        return "Editorial{" +
                "codigo='" + codigo + '\'' +
                ", titulo='" + titulo + '\'' +
                ", anoPublicacion=" + anoPublicacion +
                '}';
    }

    public void devolveranoPublicacion(){
        System.out.println("Año de publicación: " + getAnoPublicacion());
    }

    public void devolverCodigo(){
        System.out.println("Código: " + getCodigo());
    }
}
