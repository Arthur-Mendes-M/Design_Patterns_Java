package Behavioral_Patterns.memento_13.no_pattern;

class App {
    private String level;
    private int score;

    public void set(String level, int score) {
        this.level = level;
        this.score = score;
    }

    public String getLevel() {
        return level;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Game [Level=" + level + ", Score=" + score + "]";
    }

    public static void main(String[] args) {
        App game = new App();
        game.set("Level 1", 100);
        System.out.println(game);  // Output: Game [
    }
}