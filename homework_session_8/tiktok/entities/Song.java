package homework_session_8.tiktok.entities;

public class Song extends BaseEntity{
    private static int autoID;
    private int id;
    private String singer;

    public Song() {
    }

    public Song(String name, String singer) {
        super(name);
        this.id = autoID++;
        this.singer = singer;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public static int getAutoID() {
        return autoID;
    }

    public static void setAutoID(int autoID) {
        Song.autoID = autoID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Song{" + " ID =  " + getId() + ", name = " + getName() +
                "singer ='" + singer + '\'' +
                '}';
    }
}
