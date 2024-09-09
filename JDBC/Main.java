
import java.sql.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws SQLException {
        System.out.println("Hello MyDB");
        String sql="select * from stu";
        String url="jdbc:postgresql://localhost:5432/Demo";
        String user="postgres";
        String pass="0000";
        Connection con= DriverManager.getConnection(url,user,pass);
        Statement st=con.createStatement();
        ResultSet ss= st.executeQuery(sql);
        while (ss.next()) {
            System.out.println(ss.getArray(1)+" "+ss.getArray(2));
        }
        con.close();

    }
}