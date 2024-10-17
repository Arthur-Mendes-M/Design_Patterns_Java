package Behavioral_Patterns.memento_13.using_pattern;

// Memento class
class GameMemento {
    private final String level;
    private final int score;

    public GameMemento(String level, int score) {
        this.level = level;
        this.score = score;
    }

    public String getLevel() {
        return level;
    }

    public int getScore() {
        return score;
    }
}

// Originator class
class Game {
    private String level;
    private int score;

    public void set(String level, int score) {
        this.level = level;
        this.score = score;
    }

    public GameMemento save() {
        return new GameMemento(level, score);
    }

    public void restore(GameMemento memento) {
        this.level = memento.getLevel();
        this.score = memento.getScore();
    }

    @Override
    public String toString() {
        return "Game [Level=" + level + ", Score=" + score + "]";
    }
}

// Caretaker class
public class App {
    public static void main(String[] args) {
        Game game = new Game();
        game.set("Level 1", 100);
        System.out.println("Game at start: " + game);  // Output: Game [Level=Level 1, Score=100]

        // Save the state
        GameMemento savedState = game.save();

        // Change the state
        game.set("Level 2", 300);
        System.out.println("Game after level change: " + game);  // Output: Game [Level=Level 2, Score=300]

        // Restore the saved state
        game.restore(savedState);
        System.out.println("Game after restore: " + game);  // Output: Game [Level=Level 1, Score=100]
    }
}
