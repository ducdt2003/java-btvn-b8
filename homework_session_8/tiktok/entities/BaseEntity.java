package homework_session_8.tiktok.entities;

public class BaseEntity {

    private String name;

    public BaseEntity() {
    }


    public BaseEntity( String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
