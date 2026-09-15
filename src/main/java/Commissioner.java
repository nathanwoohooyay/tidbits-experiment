import java.util.List;

public class Commissioner {
    private String name;

    public Commissioner(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSchedule(League league, List<Game> schedule) {
        league.setSchedule();
        for (Game game : schedule) {
            league.addGame(game);
        }
    }

    public void movePlayer(Player player, Team toTeam) {
        Team fromTeam = player.getCurrentTeam();
        if (fromTeam != null) {
            fromTeam.removePlayer(player);
        }
        toTeam.addPlayer(player);
    }

    public void changePlayerSalary(Player player, double newSalary) {
        player.setSalary(newSalary);
    }

    public void approveTrade(TradeRequest request) {
        request.approve();
        movePlayer(request.getPlayer(), request.getTargetTeam());
    }
}
