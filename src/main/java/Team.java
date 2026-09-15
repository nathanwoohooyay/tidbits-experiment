import java.util.ArrayList;
import java.util.List;

public class Team {

    private String name;
    private double budget;
    private double budgetUsage;
    private List<Player> players;

    public Team(String name, double budget) {
        this.name = name;
        this.budget = budget;
        this.budgetUsage = 0;

        players = new ArrayList<>();
    }

    public Team(String name, double budget, double budgetUsage, List<Game> games, List<Player> players) {
        this.name = name;
        this.budget = budget;
        this.budgetUsage = budgetUsage;

        this.players = players;
    }

    public boolean canAfford(double amount) {
        return budgetUsage + amount <= budget;
    }

    public void addPlayer(Player player) {
        if (players.contains(player)) {
            throw new IllegalArgumentException("Player already on team");
        }

        if (this.canAfford(player.salary)) {
            players.add(player);
            budgetUsage += player.salary;

        } else {
            throw new IllegalArgumentException("Can't afford player");
        }

    }

    public void removePlayer(Player player) {
        if (!players.contains(player)) {
            throw new IllegalArgumentException("Player not on team");
        }

        players.remove(player);
        budgetUsage -= player.salary;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public double getBudgetUsage() {
        return budgetUsage;
    }

    public void setBudgetUsage(double budgetUsage) {
        this.budgetUsage = budgetUsage;
    }
}
