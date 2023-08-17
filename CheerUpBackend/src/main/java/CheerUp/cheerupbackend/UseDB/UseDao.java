package CheerUp.cheerupbackend.UseDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UseDao {
    public void add() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/cheerup", "root", "chung0916"
        );
        PreparedStatement ps = conn.prepareStatement(
                "INSERT INTO users(id, name, password) values(?,?,?)"
        );
        ps.setString(1, "1"); //id
        ps.setString(2, "jini"); //name
        ps.setString(3, "1123"); //pw
        //title
        //content

        int status = ps.executeUpdate();
        ps.close();
        conn.close();
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UseDao useDao = new UseDao();
        useDao.add();
    }
}
