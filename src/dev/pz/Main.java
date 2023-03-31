package dev.pz;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Team<CSGO> fnatic = new Team<>("FNatic");
        fnatic.initializeGameTeam(new Player("Nico", GameRole.MIDDLE),
                new Player("KRIMZ", GameRole.SHORT),
                new Player("mezii", GameRole.SHORT),
                new Player("roej", GameRole.LONG),
                new Player("FASHR", GameRole.LONG));
        fnatic.printTeamMembers();

    }



}

//    Team<CSGO> fnatic = new Team<CSGO>("FNatic");
//    List <Player> fnaticRoster = new ArrayList<>();
//        fnatic.addTeamMember(new Player("Nico", "Mid"), fnaticRoster);
//        fnatic.addTeamMember(new Player("KRIMZ", "Short"), fnaticRoster);
//        fnatic.addTeamMember(new Player("mezii", "Short"), fnaticRoster);
//        fnatic.addTeamMember(new Player("roej", "Long"), fnaticRoster);
//        fnatic.addTeamMember(new Player("FASHR", "Long"), fnaticRoster);
//        fnatic.printTeamMembers(fnaticRoster);
//}