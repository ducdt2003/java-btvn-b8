package homework_session_8.tiktok.entities;

import java.util.ArrayList;

public class Idol extends BaseEntity{
    private static int autoID;
    private int id;
    private String email;
    private ArrayList<Follower> followers;
    private String group;

    public Idol() {
    }

    public Idol(String name, String email, ArrayList<Follower> followers, String group) {
        super(name);
        this.id = autoID++;
        this.email = email;
        this.followers = followers;
        this.group = group;
    }

    public static int getAutoID() {
        return autoID;
    }

    public static void setAutoID(int autoID) {
        Idol.autoID = autoID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Follower> getFollowers() {
        return followers;
    }

    public void setFollowers(ArrayList<Follower> followers) {
        this.followers = followers;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Idol{" + " ID = " + getId() + ", name = " + getName() +
                "email ='" + email + '\'' +
                ", followers =" + followers +
                ", group ='" + group + '\'' +
                '}';
    }
}
