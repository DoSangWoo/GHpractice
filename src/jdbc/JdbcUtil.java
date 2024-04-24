package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//JDBC 관련 유틸리티 클래스
public class JdbcUtil {

 // ResultSet을 닫는 메서드
 public static void close(ResultSet rs) {
     if (rs != null) {
         try {
             rs.close(); // ResultSet을 닫음
         } catch (SQLException ex) {
             // 예외 처리가 필요하지 않음
         }
     }
 }
 
 // Statement를 닫는 메서드
 public static void close(Statement stmt) {
     if (stmt != null) {
         try {
             stmt.close(); // Statement를 닫음
         } catch (SQLException ex) {
             // 예외 처리가 필요하지 않음
         }
     }
 }
 
 // Connection을 닫는 메서드
 public static void close(Connection conn) {
     if (conn != null) {
         try {
             conn.close(); // Connection을 닫음
         } catch (SQLException ex) {
             // 예외 처리가 필요하지 않음
         }
     }
 }
 
 // 롤백을 수행하는 메서드
 public static void rollback(Connection conn) {
     if (conn != null) {
         try {
             conn.rollback(); // 롤백 수행
         } catch (SQLException ex) {
             // 예외 처리가 필요하지 않음
         }
     }
 }
}