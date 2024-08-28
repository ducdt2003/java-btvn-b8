package homework_session_8.tiktok.service;

import homework_session_8.tiktok.entities.Song;

import java.util.ArrayList;
import java.util.Scanner;

public class SongService {
    public ArrayList<Song> inputSong(Scanner sc){
        ArrayList<Song> songs = new ArrayList<>();
        System.out.println("Nhập tên bài hát: ");
        String song = sc.nextLine();
        System.out.println("Nhập ca sỹ: ");
        String singer = sc.nextLine();
        Song song1 = new Song(song, singer);
        songs.add(song1);
        return songs;
    }

}
