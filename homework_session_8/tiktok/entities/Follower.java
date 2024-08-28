package homework_session_8.tiktok.entities;

public class Follower extends BaseEntity {
    private String email;
    private int numberOfLike;

    public Follower() {
    }

    public Follower(String name, String email, int numberOfLike) {
        super(name);
        this.email = email;
        this.numberOfLike = numberOfLike;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumberOfLike() {
        return numberOfLike;
    }

    public void setNumberOfLike(int numberOfLike) {
        this.numberOfLike = numberOfLike;
    }

    @Override
    public String toString() {
        return "Follower{"  + " name=" + getName() +
                ", email='" + email + '\'' +
                ", numberOfLike=" + numberOfLike +
                '}';
    }
}
