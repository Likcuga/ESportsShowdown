package dev.pz;


enum MatchType{COMPETITIVE, EXHIBITION, FRIENDLY, TO_THE_DEATH, BATTLE_ROYALE}



public class GameMatch<T> {

    private String gameOutcome;
    private int team1Points=0;
    private int team2Points=0;
    private String matchType;

    private Team<Game> team1;
    private Team<Game> team2;

    public GameMatch(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
    }

    public void addPoint(Team team)
    {
        if (team == team1){
            team1Points++;
            System.out.println(team.getClass().getSimpleName() + "1 scored a point!");
            System.out.println("Current number of points: " + team1Points);
        }
        else if (team == team2) {
            team2Points++;
            System.out.println(team.getClass().getSimpleName() + "2 scored a point");
            System.out.println("Current number of points: " + team2Points);
        }
        else System.out.println("NOT A TEAM IN THE GAME!");
    }

    public void setMatchType(MatchType match) {
        this.matchType = match.name();
    }

    public int getTeamPoints(Team<Game> team) {
        if (team == team1) return team1Points;
        else if (team == team2)return team2Points;
        else return 0;
    }

    public String getGameOutcome()
    {
        if (team1Points>team2Points) {

            return "Team 1 won the game!";
        }
        else if (team1Points<team2Points) return "Team 2 won the game!";
        else return "TIED";
    }

    public void setGameOutcome(GameOutcome gameOutcome) {
        this.gameOutcome = gameOutcome.name();
    }
}
