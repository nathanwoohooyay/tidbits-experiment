import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Game {
    private int gameID;
    private Date gameDate;
    private boolean finished;
    private int homeScore;
    private int awayScore;
    private Team homeTeam;
    private Team awayTeam;

    public Game(int gameID, Date gameDate, Team homeTeam, Team awayTeam) {
        this.gameID = gameID;
        this.gameDate = gameDate;
        this.finished = false;
        this.homeScore = 0;
        this.awayScore = 0;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }

    public int getGameID() {
        return gameID;
    }

    public void finishGame() {
        this.finished = true;
    }

    public boolean isFinished() {
        return finished;
    }

    public List<String> getGameDetails() {
        List<String> details = new ArrayList<>();
        details.add("Game ID: " + gameID);
        details.add("Date: " + gameDate);
        details.add("Home Team: " + homeTeam.getName() + " (Score: " + homeScore + ")");
        details.add("Away Team: " + awayTeam.getName() + " (Score: " + awayScore + ")");
        details.add("Finished: " + finished);
        return details;
    }

}
