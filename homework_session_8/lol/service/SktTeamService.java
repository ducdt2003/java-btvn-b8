package homework_session_8.lol.service;

import homework_session_8.lol.entities.NameFigure;
import homework_session_8.lol.entities.SktTeam;

import java.util.ArrayList;
import java.util.Scanner;

public class SktTeamService {
    public ArrayList<SktTeam> inputSktTeam(Scanner sc){
        ArrayList<SktTeam> sktTeams = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            System.out.print(" Nhập tên thành viên thứ " + i + ":\t");
            String name = sc.nextLine();
            System.out.println(" Nhâp thông tin tướng thứ " + i + "");
            NameFigureService nameFigureService = new NameFigureService();
            ArrayList<NameFigure> nameFigure = nameFigureService.inputNameFigure(sc);
            SktTeam sktTeam = new SktTeam(name, nameFigure);
            sktTeams.add(sktTeam);
        }
        return sktTeams;
    }
}
