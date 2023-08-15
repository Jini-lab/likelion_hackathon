package CheerUp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    //    public static void main(String[] args) {
//        // Press Opt+Enter with your caret at the highlighted text to see how
//        // IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        // Press Ctrl+R or click the green arrow button in the gutter to run the code.
//        for (int i = 1; i <= 5; i++) {
//
//            // Press Ctrl+D to start debugging your code. We have set one breakpoint
//            // for you, but you can always add more by pressing Cmd+F8.
//            System.out.println("i = " + i);
//        }
//    }
    public static void main(String[] args) {
        Connection con = null;

        String server = "localhost:3306"; // MySQL 서버 주소
        String database = "cheerup1"; // MySQL DATABASE 이름
        String user_name = "root"; //  MySQL 서버 아이디
        String password = "chung0916"; // MySQL 서버 비밀번호

        // 1.드라이버 로딩
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println(" !! <JDBC 오류> Driver load 오류: " + e.getMessage());
            e.printStackTrace();
        }

        // 2.연결
        try {
            con = DriverManager.getConnection("jdbc:mysql://" + server + "/" + database + "?useSSL=false", user_name, password);
            System.out.println("정상적으로 연결되었습니다.");
        } catch (SQLException e) {
            System.err.println("con 오류:" + e.getMessage());
            e.printStackTrace();
        }

        // 3.해제
        try {
            if (con != null)
                con.close();
        } catch (SQLException e) {
        }
    }

}
