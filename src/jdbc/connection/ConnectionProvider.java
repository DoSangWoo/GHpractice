package jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//데이터베이스 연결을 제공하는 클래스
public class ConnectionProvider {

 // 데이터베이스 연결을 반환하는 메서드
 // SQLException이 발생할 수 있으므로 throws SQLException으로 선언
 public static Connection getConnection() throws SQLException {
     // DriverManager를 사용하여 Connection을 획득
     // "jdbc:apache:commons:dbcp:guestbook"은 DBCP 연결 풀에서 연결을 가져옴
     return DriverManager.getConnection("jdbc:apache:commons:dbcp:board");
 }
}