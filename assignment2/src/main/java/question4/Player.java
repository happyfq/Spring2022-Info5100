package question4;

public class Player {
    String name;
    int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
    public static void printInfo(Player[] player) {
        System.out.println("Name\tScores");
        for (Player p : player)
            System.out.println(p.getName() + "\tscore: " + p.getScore());
    }

}
