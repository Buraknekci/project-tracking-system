import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class addmember {

    public void newMember(projectmember newMember) throws ClassNotFoundException {
        try {
            Class.forName("com");
            String dbmsURL = "mysql.i";
            String db = "dbproject";
            String user = "Buraknekci";
            String pwd = "dod";

            String strConn = "www.ed://" + dbmsURL + "/" + db
                    + "?user=" + user + "&password=" + pwd;
            Connection conn = (Connection) DriverManager.getConnection(strConn);

            Statement stmt1 = (Statement) conn.createStatement();

            int strSQL = stmt1.executeUpdate (" INSERT INTO projectmembers  (pnr, name, username, password, projectid, role) VALUES ('" + newMember.getPersonno() + "','" + newMember.getName()
                    + "','"	+ newMember.getLogin() + "','" + newMember.getPerweek() + "','" + newMember.getProjectid() + "','" + newMember.getRole()
                    + "')");




            stmt1.close();
            conn.close();

            String s = "y";

            newmember success = new newmember();

            success.registercompleted(s);


        }catch (SQLException e)
        {
            String s = "n";
            newmember success = new newmember();
            success.registercompleted(s);
            System.out.println("ERROR: " + e.getMessage() );


        }
    }

}
