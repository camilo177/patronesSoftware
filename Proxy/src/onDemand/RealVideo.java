package onDemand;
// 2. Clase que representa un video real
class RealVideo implements Video {
    private String title;

    public RealVideo(String title) {
        this.title = title;
        // Descargar el video real desde el servidor de contenido
        System.out.println("Descargando video: " + title);
    }

    @Override
    public void play() {
        System.out.println("Reproduciendo el video: " + title);
    }

}