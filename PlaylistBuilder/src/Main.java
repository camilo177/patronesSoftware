class Song {
    private String title;
    private String artist;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void showSong() {
        System.out.println("Canción: " + title + " de " + artist);
    }
}

// PlaylistBuilder interface
interface PlaylistBuilder {
    void buildTitle();
    void buildArtist();
    Song getSong();
}
//Implementation
class PopPlaylistBuilder implements PlaylistBuilder {
    private Song song = new Song();

    @Override
    public void buildTitle() {
        song.setTitle("Fly me to the moon");
    }

    @Override
    public void buildArtist() {
        song.setArtist("Frank Sinatra");
    }

    @Override
    public Song getSong() {
        return song;
    }
}

// Director class
class PlaylistDirector {
    private PlaylistBuilder playlistBuilder;

    public PlaylistDirector(PlaylistBuilder playlistBuilder) {
        this.playlistBuilder = playlistBuilder;
    }

    public void buildSong() {
        playlistBuilder.buildTitle();
        playlistBuilder.buildArtist();
    }
}

// Main
public class Main {
    public static void main(String[] args) {
        PlaylistBuilder popPlaylistBuilder = new PopPlaylistBuilder();
        PlaylistDirector director = new PlaylistDirector(popPlaylistBuilder);

        director.buildSong();

        Song song = popPlaylistBuilder.getSong();
        song.showSong();
    }
}
