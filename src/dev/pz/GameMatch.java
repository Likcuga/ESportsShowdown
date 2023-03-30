package dev.pz;


enum MatchType{COMPETITIVE, EXHIBITION, FRIENDLY, TO_THE_DEATH, BATTLE_ROYALE}


public class GameMatch {

    private String gameOutcome;
    private int teamPoints;


    public void addPoint(Team<Game> team)
    {
        this.teamPoints = teamPoints+1;
        System.out.println(team.getClass().getName() + " scored a point!");
    }

    public String getGameOutcome(Team<Game> team1, Team<Game> team2)
    {
       // if (team1)
        return null;
    }

}
