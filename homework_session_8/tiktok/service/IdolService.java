package homework_session_8.tiktok.service;

import homework_session_8.tiktok.entities.Follower;
import homework_session_8.tiktok.entities.Idol;

import java.util.ArrayList;
import java.util.Scanner;

public class IdolService {


    public ArrayList<Idol> inputIdols(Scanner sc){
        ArrayList<Idol> idols = new ArrayList<>();
            System.out.println("Nhập tên idols: ");
            String nameIdol = sc.nextLine();
            System.out.println("Nhập email: ");
            String email = sc.nextLine();
            System.out.println("\t\tNhững người đang theo dõi Idol ");
            FollowerService followerService = new FollowerService();
            ArrayList<Follower> follower = followerService.inputFollower(sc);
            System.out.println("Nhập group: ");
            String group = sc.nextLine();
            Idol idol = new Idol(nameIdol, email, follower, group);
            idols.add(idol);
            return idols;
    }
}
