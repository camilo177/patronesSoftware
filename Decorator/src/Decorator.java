//Interfaz común
interface MusicPlayer{
    void play();
}

//Interfaz común para la reproducción de música
class SimpleMusicPlayer implements MusicPlayer{
    @Override
    public void play() {
        System.out.println("Playing music");
    }
}

//Decorador Abstracto para agregar efectos a la reproducción de música
abstract class MusicPlayerDecorator implements MusicPlayer{
    protected MusicPlayer musicPlayer;

    public MusicPlayerDecorator(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }
    @Override
    public void play() {
        musicPlayer.play();
    }
}

//Decorador concreto que agrega un efecto de ecualización
class EqualizerDecorator extends MusicPlayerDecorator{
    public EqualizerDecorator(MusicPlayer musicPlayer) {
        super(musicPlayer);
    }
    @Override
    public void play() {
        super.play();
        System.out.println("Adding equalizer effect");
    }
}
