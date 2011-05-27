// A simple speed test for the MiniConnectionPoolManager class.

import java.sql.Connection;
import javax.sql.ConnectionPoolDataSource;
import biz.source_code.miniConnectionPoolManager.MiniConnectionPoolManager;

public class SpeedTest {

private static final int                  measurementTime = 10000;

private static MiniConnectionPoolManager  poolMgr;

public static void main (String[] args) throws Exception {
   System.out.println("Program started.");
   ConnectionPoolDataSource dataSource = DataSourceFactory.createDataSource();
   poolMgr = new MiniConnectionPoolManager(dataSource,10);
   long startTime = System.currentTimeMillis();
   long cycles = 0;
   while (System.currentTimeMillis()-startTime < measurementTime) {
      Connection conn = poolMgr.getConnection();
      conn.close();
      cycles++; }
   long totalTime = System.currentTimeMillis()-startTime;
   System.out.println("Total milliseconds: "+totalTime);
   System.out.println("Cycles: "+cycles);
   System.out.println("Microseconds per cycle: "+((float)totalTime*1000/cycles)); }

} // end class SpeedTest