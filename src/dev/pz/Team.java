package dev.pz;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
enum GameOutcome {WON_GAME, TIED_GAME, LOST_GAME, FORFEIT, DELAYED}
enum GameRole {MIDDLE, TOP, BOTTOM, SHORT, LONG, BANANA, A_SITE, B_SITE, JUNGLE}

record Player(String playerName, GameRole position){}

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

    List<Player> teamRoster = new ArrayList<>();

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

    public void printTeamMembers()
    {
        for(var itr : teamRoster) System.out.println(itr);
    }


    public Team<Game> initializeGameTeam(Player... players)
    {

        if (players.length !=5) throw new IllegalArgumentException("A game team must have exactly 5 players!");
        Team<Game> team = new Team<Game>(teamName);
        teamRoster = Arrays.asList(players);

        return team;
    }




}
//    public Team<Game> initializeGameTeam(String teamName, Player player1, GameRole player1Role, Player player2, GameRole player2Role,
//                                         Player player3, GameRole player3Role, Player player4, GameRole player4Role,
//                                         Player player5, GameRole player5Role)
//    {
//        Team<Game> team = new Team<Game>(teamName);
//        List <Player> teamRoster = new ArrayList<>(Arrays.asList(new Player(player1, player1Role),
//                new Player(player2, player2Role), ));
//
//
//        return team;
//    }