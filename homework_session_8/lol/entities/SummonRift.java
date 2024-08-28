package homework_session_8.lol.entities;

import java.util.ArrayList;

public class SummonRift {
    private ArrayList<SktTeam> sktTeams;
    private ArrayList<G2Team> g2Teams;
    private String time;

    public SummonRift() {
    }

    public SummonRift(ArrayList<SktTeam> sktTeams, ArrayList<G2Team> g2Teams, String time) {
        this.sktTeams = sktTeams;
        this.g2Teams = g2Teams;
        this.time = time;
    }

    public ArrayList<SktTeam> getSktTeams() {
        return sktTeams;
    }

    public void setSktTeams(ArrayList<SktTeam> sktTeams) {
        this.sktTeams = sktTeams;
    }

    public ArrayList<G2Team> getG2Teams() {
        return g2Teams;
    }

    public void setG2Teams(ArrayList<G2Team> g2Teams) {
        this.g2Teams = g2Teams;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return  "TIME" + "\n" + getTime() + " TEAM SKT " + "[" + getSktTeams() + "]" + "\n"
                + " TEAM G2 " + "[" + getG2Teams() + "]" + "\n";
    }
}
