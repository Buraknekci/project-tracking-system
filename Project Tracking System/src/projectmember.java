public class projectmember {
    String personno;
    String name;
    String login;
    String perweek;
    String role;
    String projectid;

    public String getPersonno() {
        return personno;
    }

    public void setPersonno(String personno) {
        this.personno = personno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPerweek() {
        return perweek;
    }

    public void setPerweek(String perweek) {
        this.perweek = perweek;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getProjectid() {
        return projectid;
    }

    public void setProjectid(String projectid) {
        this.projectid = projectid;
    }

    public projectmember(String personno, String name, String login, String perweek,
                         String role, String projectid) {
        super();
        this.personno = personno;
        this.name = name;
        this.login = login;
        this.perweek = perweek;
        this.role = role;
        this.projectid = projectid;
    }

}