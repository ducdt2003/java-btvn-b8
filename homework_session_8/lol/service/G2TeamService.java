package homework_session_8.lol.service;

import homework_session_8.lol.entities.G2Team;
import homework_session_8.lol.entities.NameFigure;

import java.util.ArrayList;
import java.util.Scanner;

public class G2TeamService {
    public ArrayList<G2Team> inputG2Team(Scanner sc){
        ArrayList<G2Team> g2Teams = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            System.out.print(" Nhập tên thành viên thứ " + i + ":\t ");
            String name = sc.nextLine();
            System.out.println(" Nhâp thông tin tướng thứ " + i + "");
            NameFigureService nameFigureService = new NameFigureService();
            ArrayList<NameFigure> nameFigure = nameFigureService.inputNameFigure(sc);
            G2Team g2Team = new G2Team(name, nameFigure);
            g2Teams.add(g2Team);
        }
        return g2Teams;
    }
}
