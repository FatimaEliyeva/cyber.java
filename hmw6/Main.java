import java.util.*;

class Player {
    String name;
    int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return name + " - " + score;
    }
}

class PlayerComparator implements Comparator<Player> {
    @Override
    public int compare(Player p1, Player p2) {
        if (p1.score != p2.score) {
            return Integer.compare(p2.score, p1.score);
        }
        return p1.name.compareTo(p2.name);
    }
}

public class Main {
    public static void main(String[] args) {
        List<Player> players = new ArrayList<>();
        players.add(new Player("Eli", 50));
        players.add(new Player("Zeyneb", 70));
        players.add(new Player("Mamed", 50));
        players.add(new Player("Ayşe", 80));
        players.add(new Player("Kerim", 70));

        System.out.println("Before comparison:");
        for (Player p : players) {
            System.out.println(p);
        }

        Collections.sort(players, new PlayerComparator());

        System.out.println("\nAfter Comparison:");
        for (Player p : players) {
            System.out.println(p);
        }
    }
}
