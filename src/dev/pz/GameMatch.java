package dev.pz;


enum MatchType{COMPETITIVE, EXHIBITION, FRIENDLY, TO_THE_DEATH, BATTLE_ROYALE}



public class GameMatch<T> {

    private String gameOutcome;
    private int teamPoints;
    private String matchType;

    private Team<Game> team1;
    private Team<Game> team2;

    public GameMatch(Team<Game> team1, Team<Game> team2) {
        this.team1 = team1;
        this.team2 = team2;
    }

    public void addPoint(Team<Game> team)
    {
        this.teamPoints = teamPoints+1;
        System.out.println(team.getClass().getName() + " scored a point!");
    }

    public void setMatchType(MatchType match) {
        this.matchType = match.name();
    }

    public int getTeamPoints() {
        return teamPoints;
    }

    public String getGameOutcome(Team<Game> team1, Team<Game> team2)
    {
       // if (team1)
        return null;
    }

    public void setGameOutcome(GameOutcome gameOutcome) {
        this.gameOutcome = gameOutcome.name();
    }
}
