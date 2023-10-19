public class Main {
    public static void main(String[] args) {
        //Reproducir música simple
        MusicPlayer simplePlayer = new SimpleMusicPlayer();
        System.out.println("Simple Music player");
        simplePlayer.play();

        //Música con efecto
        MusicPlayer equalizerPlayer = new EqualizerDecorator(new SimpleMusicPlayer());
        System.out.println("Music player with equalizer: ");
        equalizerPlayer.play();
    }
}
