package homework_session_8.lol.service;

import homework_session_8.lol.entities.NameFigure;

import java.util.ArrayList;
import java.util.Scanner;

public class NameFigureService {
    public ArrayList<NameFigure> inputNameFigure(Scanner sc){
        ArrayList<NameFigure> nameFigures = new ArrayList<>();
        System.out.println(" Nhập tên tướng ");
        String name = sc.nextLine();
        System.out.println(" Nhập Vai trò ");
        String position = sc.nextLine();
        NameFigure nameFigure = new NameFigure(name, position);
        nameFigures.add(nameFigure);
        return nameFigures;
    }
}
