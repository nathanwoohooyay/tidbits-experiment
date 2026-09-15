public class TradeRequest {
    private Player player;
    private Team targetTeam;
    private String status;

    private static final String REJECTED = "REJECTED";
    private static final String APPROVED = "APPROVED";


    public void TradeRequest(Player player, Team targetTeam, String status){
        this.player = player;
        this.targetTeam = targetTeam;
        this.status = status;
    }

    public void approve(){
        this.status = APPROVED;
        this.targetTeam.addPlayer(this.player);
    }
    public void reject(){
        this.status = REJECTED;
    }
}



