package server;

public class BeanRfc {
    private int id;
    private String name;
    private  String firtsname;
    private String secondname;
    private String curp;
    private  String age;

    public BeanRfc() {
    }

    public BeanRfc(int id, String name, String firtsname, String secondname, String curp, String age) {
        this.id = id;
        this.name = name;
        this.firtsname = firtsname;
        this.secondname = secondname;
        this.curp = curp;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirtsname() {
        return firtsname;
    }

    public void setFirtsname(String firtsname) {
        this.firtsname = firtsname;
    }

    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
