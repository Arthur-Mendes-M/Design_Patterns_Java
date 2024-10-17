package Structural_Patterns.bridge_20.no_pattern;

// Existing classes for media playback
class MP3Player {
    public void playMP3(String filename) {
        System.out.println("Playing MP3: " + filename);
    }
}

class MP4Player {
    public void playMP4(String filename) {
        System.out.println("Playing MP4: " + filename);
    }
}

// Client code without Bridge Pattern
public class App {
    public static void main(String[] args) {
        MP3Player mp3Player = new MP3Player();
        MP4Player mp4Player = new MP4Player();

        mp3Player.playMP3("song.mp3"); // Output: Playing MP3: song.mp3
        mp4Player.playMP4("movie.mp4"); // Output: Playing MP4: movie.mp4
    }
}

