package onDemand;

public class Main {
    public static void main(String[] args) {
        // Uso del Proxy para acceder a los videos
        Video video1 = new VideoProxy("The Lord of the Rings");
        Video video2 = new VideoProxy("The Last of us");

        video1.play(); // Descargará y reproducirá el video 1
        video2.play();// Descargará y reproducirá el video 2

        System.out.println("==================================================================");
        System.out.println("Video 1 se pone en pausa, y se retoma después");
        video1.play(); // Acceso nuevamente al video 1, no descargará el video real nuevamente
    }
}
