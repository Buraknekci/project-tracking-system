import java.sql.*;

public class checkLogin {

    public checkLogin() {


    }

    public void db_checkLogin(String username, String password) throws ClassNotFoundException {


        try {
            Class.forName("com.sdf");
            String dbmsURL = "mysql.fasdf";
            String db = "d_project";
            String user = "Burak";
            String pwd = "burak23";

            String strConn = "jdbc:mysql://" + dbmsURL + "/" + db
                    + "?user=" + user + "&password=" + pwd;
            try (Connection conn = DriverManager.getConnection(strConn)) {

                Statement stmt1 = conn.createStatement();


                ResultSet rs = stmt1.executeQuery(" SELECT * FROM projectmembers WHERE username='" + username + "' AND password='" + password + "';");

                String projectmanager;

                if (rs.isBeforeFirst() == true) {

                    rs.first();
                    System.out.println(rs.getString("role"));


                    if (rs.getString("role").equals("Projectmanager")) {
                        projectmanager = "yes";

                        login rolecheck = new login();

                        rolecheck.roleCheck(projectmanager);


                    } else if (rs.getString("role").equals("Systemdeveloper") || rs.getString("role").equals("Programmer")) {

                        login rolecheck = new login();
                        projectmanager = "no";


                        rolecheck.roleCheck(projectmanager);

                    }


                } else {

                    String incorrect;
                    login loginCheck = new login();
                    incorrect = "no";
                    loginCheck.logincheck(incorrect);
                }


                stmt1.close();

            }


        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }


    }

}