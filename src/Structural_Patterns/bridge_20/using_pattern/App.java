package Structural_Patterns.bridge_20.using_pattern;

// Implementor interface
interface MediaPlayer {
    void play(String filename);
}

// Concrete implementation for MP3
class MP3Player implements MediaPlayer {
    @Override
    public void play(String filename) {
        System.out.println("Playing MP3: " + filename);
    }
}

// Concrete implementation for MP4
class MP4Player implements MediaPlayer {
    @Override
    public void play(String filename) {
        System.out.println("Playing MP4: " + filename);
    }
}

// Abstraction class
abstract class Media {
    protected MediaPlayer mediaPlayer;

    protected Media(MediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }

    public abstract void play(String filename);
}

// Refined abstraction for audio media
class Audio extends Media {
    public Audio(MediaPlayer mediaPlayer) {
        super(mediaPlayer);
    }

    @Override
    public void play(String filename) {
        mediaPlayer.play(filename);
    }
}

// Refined abstraction for video media
class Video extends Media {
    public Video(MediaPlayer mediaPlayer) {
        super(mediaPlayer);
    }

    @Override
    public void play(String filename) {
        mediaPlayer.play(filename);
    }
}

// Client code
public class App {
    public static void main(String[] args) {
        Media mp3 = new Audio(new MP3Player());
        Media mp4 = new Video(new MP4Player());

        mp3.play("song.mp3"); // Output: Playing MP3: song.mp3
        mp4.play("movie.mp4"); // Output: Playing MP4: movie.mp4
    }
}
