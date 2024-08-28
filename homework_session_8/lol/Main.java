package homework_session_8.lol;

import homework_session_8.lol.entities.SummonRift;
import homework_session_8.lol.service.SummonRiftService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SummonRiftService service = new SummonRiftService();
        ArrayList<SummonRift> summonRift = service.inputSummonRift(sc);
        for (SummonRift summonRift1: summonRift) {
            System.out.println(summonRift1);
        }
    }
}
