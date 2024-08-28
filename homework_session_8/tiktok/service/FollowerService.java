package homework_session_8.tiktok.service;

import homework_session_8.tiktok.entities.Follower;

import java.util.ArrayList;
import java.util.Scanner;

public class FollowerService {
    public ArrayList<Follower> inputFollower(Scanner sc){
        ArrayList<Follower> followers = new ArrayList<>();
        while (true){
            System.out.print(" \tNhập tên người follower: ");
            String name = sc.nextLine();
            System.out.print(" \tNhập email người follower: ");
            String email = sc.nextLine();
            System.out.print(" \tNhập số like: ");
            int like = Integer.parseInt(sc.nextLine());
            Follower follower = new Follower(name, email, like);
            followers.add(follower);
            System.out.println(" Bạn có muốn nhập tiếp người dõi khác không");
            System.out.println(" chọn (N--> là không) || (Y--> là có ) ");
            String choice = sc.nextLine();
            if (choice.equalsIgnoreCase("Y")){
                System.out.println("Tiếp Tục Nhập người theo dõi khác");
            }else if (choice.equalsIgnoreCase("N")){
                break;
            }else {
                System.out.println(" lỗi thoát chương trình!");
            }
        }
        for ( Follower follower : followers) {
            System.out.println(follower);
        }
        return followers;
    }

}
