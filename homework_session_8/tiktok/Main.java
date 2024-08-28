package homework_session_8.tiktok;

import homework_session_8.tiktok.entities.BaseEntity;
import homework_session_8.tiktok.entities.Idol;
import homework_session_8.tiktok.entities.Song;
import homework_session_8.tiktok.service.IdolService;
import homework_session_8.tiktok.service.SongService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<BaseEntity> baseEntities = new ArrayList<>();
        displayIdols(sc, baseEntities);
        displaySong(sc, baseEntities);

        System.out.println("\t\t\n\nDanh Sách các Idols và các bài hát");
        for (BaseEntity base : baseEntities) {
            System.out.println(base);
        }
    }
    public static void displayIdols(Scanner sc, ArrayList<BaseEntity> baseEntities){
        IdolService idolService = new IdolService();
        System.out.println(" Nhập số Idol của bạn ");
        int number = Integer.parseInt(sc.nextLine());
        if( number > 0 ) {
            for (int i = 0; i < number; i++) {
                System.out.println(" ----Idol thứ " + ( i + 1 ) + "-----");
                ArrayList<Idol> idol = idolService.inputIdols(sc);
                baseEntities.addAll(idol);
//                System.out.println(idol);
            }
        }else {
            System.out.println(" bạn không Idol ai cả");
        }
    }
    public static void displaySong(Scanner sc,ArrayList<BaseEntity> baseEntities){
        SongService songService = new SongService();
        System.out.println("\n\n---------------");
        System.out.println(" Nhập số Bài hát ");
        int number = Integer.parseInt(sc.nextLine());
        if( number > 0 ) {
            for (int i = 0; i < number; i++) {
                System.out.println(" ----Song thứ " + ( i + 1 ) + "-----");
                ArrayList<Song> songs = songService.inputSong(sc);
                baseEntities.addAll(songs);
//                System.out.println(songs);
            }
        }else {
            System.out.println(" bạn không Idol ai cả");
        }
    }
}

