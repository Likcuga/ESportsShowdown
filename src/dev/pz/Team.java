package dev.pz;


import java.util.List;

enum gameOutcome {WON_GAME, TIED_GAME, LOST_GAME, FORFEIT, DELAYED}

record Player(String playerName, String position){}

public class Team<T>{

    private String teamName;
    private String gameName;

    public static int getWonGames() {
        return wonGames;
    }

    public static int getTiedGames() {
        return tiedGames;
    }

    public static int getLostGames() {
        return lostGames;
    }

    private static int wonGames;
    private static int tiedGames;
    private static int lostGames;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }


    public void addTeamMember(Player player, List <Player> teamList)
    {
        teamList.add(player);
    }

    public void printTeamMembers(List<Player> teamList)
    {
        for(var itr : teamList) System.out.println(itr);
    }




}
