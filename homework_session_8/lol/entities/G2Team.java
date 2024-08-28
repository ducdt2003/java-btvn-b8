package homework_session_8.lol.entities;

import java.util.ArrayList;

public class G2Team{
    private String player;
    private ArrayList<NameFigure> nameFigures;

    public G2Team() {
    }

    public G2Team(String player, ArrayList<NameFigure> nameFigures) {
        this.player = player;
        this.nameFigures = nameFigures;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public ArrayList<NameFigure> getNameFigures() {
        return nameFigures;
    }

    public void setNameFigures(ArrayList<NameFigure> nameFigures) {
        this.nameFigures = nameFigures;
    }

    @Override
    public String toString() {
        return "G2Team{" +
                "player='" + player + '\'' +
                ", nameFigures=" + nameFigures + "}\n";
    }
}
