// A program to test the MiniConnectionPoolManager behaviour when
// the database server is disconnected and reconnected.

import java.sql.Connection;
import javax.sql.ConnectionPoolDataSource;
import biz.source_code.miniConnectionPoolManager.MiniConnectionPoolManager;

public class DisconnectionTest {

private static MiniConnectionPoolManager  poolMgr;

public static void main (String[] args) throws Exception {
   System.out.println("Program started.");
   ConnectionPoolDataSource dataSource = DataSourceFactory.createDataSource();
   poolMgr = new MiniConnectionPoolManager(dataSource, 5, 15);
   testConnection();
   System.out.print("Restart the database server and press ENTER to continue - ");
   System.console().readLine();
   testConnection();
   testConnection();
   poolMgr.dispose();
   System.out.println("Program completed."); }

private static void testConnection() throws Exception {
   System.out.println("before getConnection(): " + getStatus());
   // Connection conn = poolMgr.getConnection();
   Connection conn = poolMgr.getValidConnection();
   System.out.println("after getConnection(): " + getStatus());
   System.out.println("connection.isValid()=" + conn.isValid(10));
   System.out.println("after isValid(): " + getStatus());
   conn.close();
   System.out.println("after close(): " + getStatus()); }

private static String getStatus() {
   return "activeConnections=" + poolMgr.getActiveConnections() +
      " inactiveConnections=" + poolMgr.getInactiveConnections(); }

} // end class DisconnectionTest