import java.sql.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws SQLException {
        // Press Opt+Enter with your caret at the highlighted text to see how
     String sql = "SELECT TESTVAL FROM pgtestManual WHERE id =12";
     String url = "jdbc:postgresql://localhost:5432/postgres";
     String username = "postgres";
     String password= "0000";

        Connection con = DriverManager.getConnection(url, username, password);
        Statement st = con.createStatement();
       ResultSet rs = st.executeQuery(sql);
       rs.next();
       String res = rs.getString(1);
        System.out.println(res);
        con.close();
    }
}