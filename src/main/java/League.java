import java.util.ArrayList;
import java.util.List;

public class League {
    private String leagueName;
    private List<Team> teams;
    private List<Game> schedule;

    public League(String leagueName) {
        this.leagueName = leagueName;
        this.teams = new ArrayList<>();
        this.schedule = new ArrayList<>();
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void addTeam(Team team) {
        teams.add(team);
    }

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    public List<Game> getSchedule() {
        return schedule;
    }

    public void setSchedule() {
        this.schedule = new ArrayList<>();
    }

    public void addGame(Game game) {
        this.schedule.add(game);
    }
}