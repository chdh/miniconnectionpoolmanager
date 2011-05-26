// A simple test program for the MiniConnectionPoolManager class.

import java.io.PrintWriter;
import java.sql.Connection;
import javax.sql.ConnectionPoolDataSource;
import biz.source_code.miniConnectionPoolManager.MiniConnectionPoolManager;

public class SimpleTest {

private static MiniConnectionPoolManager  poolMgr;

public static void main (String[] args) throws Exception {
   System.out.println("Program started.");
   ConnectionPoolDataSource dataSource = DataSourceFactory.createDataSource();
   poolMgr = new MiniConnectionPoolManager(dataSource, 10);
   Connection conn = poolMgr.getConnection();
   conn.close();
   System.out.println("OK"); }

} // end class SimpleTest