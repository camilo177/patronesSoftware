package onDemand;

// 3. Clase Proxy para el video que controla el acceso
class VideoProxy implements Video {
    private RealVideo realVideo;
    private String title;

    public VideoProxy(String title) {
        this.title = title;
    }

    @Override
    public void play() {
        if (realVideo == null) {
            realVideo = new RealVideo(title); // Carga el video real solo cuando es necesario
        }
        realVideo.play();
    }
}