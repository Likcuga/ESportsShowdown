package dev.pz;

import java.sql.SQLOutput;
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

        System.out.println("");

        Team<CSGO> astralis = new Team<>("Astralis");
        fnatic.initializeGameTeam(new Player("Xyp9x", GameRole.MIDDLE),
                new Player("gla1ive", GameRole.SHORT),
                new Player("blameF", GameRole.SHORT),
                new Player("def1ce", GameRole.LONG),
                new Player("Buzz", GameRole.LONG));
        fnatic.printTeamMembers();
        System.out.println("");

        GameMatch<CSGO> fnaticVSAstralis = new GameMatch<>(fnatic, astralis);
        fnaticVSAstralis.addPoint(fnatic);
        System.out.println(fnaticVSAstralis.getGameOutcome());


    }

}