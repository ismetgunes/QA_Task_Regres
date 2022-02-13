package RegRes.POJO;

public class Reqres {

    private String name;
    private String job;
    private int id;
    private  String email;
    private  String fist_name;
    private  String last_name;

    public Reqres(String name, String job, int id, String email, String fist_name, String last_name) {
        this.name = name;
        this.job = job;
        this.id = id;
        this.email = email;
        this.fist_name = fist_name;
        this.last_name = last_name;
    }

    public Reqres() {

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFist_name(String fist_name) {
        this.fist_name = fist_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getFist_name() {
        return fist_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Reqres{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", id=" + id +
                ", email='" + email + '\'' +
                ", fist_name='" + fist_name + '\'' +
                ", last_name='" + last_name + '\'' +
                '}';
    }
}
