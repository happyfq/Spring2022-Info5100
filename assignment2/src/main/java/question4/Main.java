package question4;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Player bob = new Player("Bob", 90);
        Player cindy = new Player("Cindy", 99);
        Player aom = new Player("Aom", 99);
        Player[] player = {bob, cindy, aom};
        System.out.println("----Original Sort----");
        Player.printInfo(player);
        System.out.println("----After Sort----");
        Comparator<Player> sort = ((player1, player2) -> {
            if (player1.getScore() == player2.getScore()) {
                return player1.getName().compareTo(player2.getName());
            } else {
                return Integer.compare(player2.getScore(), player1.getScore());
            }
        });
        Arrays.sort(player, sort);
        Player.printInfo(player);
    }
}
