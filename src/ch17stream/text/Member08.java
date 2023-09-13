package ch17stream.text;

public class Member08 {
    private String name;
    private String job;

    public Member08(String name, String job){
        this.name = name;
        this.job = job;
    }

    public String getName() {return name;}

    public String getJob() {return job;}

    @Override
    public String toString() {
        return "{name: " + name + ",job: " + job + "}";
    }

}
