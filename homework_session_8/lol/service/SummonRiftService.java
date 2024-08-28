package homework_session_8.lol.service;

import homework_session_8.lol.entities.SktTeam;
import homework_session_8.lol.entities.G2Team;
import homework_session_8.lol.entities.SummonRift;

import java.util.ArrayList;
import java.util.Scanner;

public class SummonRiftService {
    public ArrayList<SummonRift> inputSummonRift(Scanner sc){
        ArrayList<SummonRift> summonRifts = new ArrayList<>();
        System.out.print("Nhập thời gian trận đấu: ");
        String time = sc.nextLine();
        System.out.println(" -------Team SKT-------");
        SktTeamService sktTeamService = new SktTeamService();
        ArrayList<SktTeam> sktTeams = sktTeamService.inputSktTeam(sc);
        System.out.println(" -------Team G2-------");
        G2TeamService g2TeamService = new G2TeamService();
        ArrayList<G2Team> g2Teams = g2TeamService.inputG2Team(sc);
        SummonRift summonRift = new SummonRift(sktTeams, g2Teams, time);
        summonRifts.add(summonRift);
        return summonRifts;
    }
}
