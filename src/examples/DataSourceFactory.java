// DataSource factory for the MiniConnectionPoolManager test programs.

import java.io.PrintWriter;
import javax.sql.ConnectionPoolDataSource;

public class DataSourceFactory {

public static ConnectionPoolDataSource createDataSource() throws Exception {

   // Version for H2:
      org.h2.jdbcx.JdbcDataSource dataSource = new org.h2.jdbcx.JdbcDataSource();
      // dataSource.setURL("jdbc:h2:file:c:/temp/tempTestMiniConnectionPoolManagerDb");
      dataSource.setURL("jdbc:h2:mem:test;DB_CLOSE_DELAY=-1");    // in-memory database

   // Version for Apache Derby:
   /*
      org.apache.derby.jdbc.EmbeddedConnectionPoolDataSource dataSource = new org.apache.derby.jdbc.EmbeddedConnectionPoolDataSource();
      dataSource.setDatabaseName("c:/temp/tempTestMiniConnectionPoolManagerDb");
      dataSource.setCreateDatabase("create");
      dataSource.setLogWriter(new PrintWriter(System.out));
   */

   // Version for JTDS:
   /*
      net.sourceforge.jtds.jdbcx.JtdsDataSource dataSource = new net.sourceforge.jtds.jdbcx.JtdsDataSource();
      dataSource.setAppName("TestMiniConnectionPoolManager");
      dataSource.setDatabaseName("Northwind");
      dataSource.setServerName("localhost");
      dataSource.setUser("sa");
      dataSource.setPassword(System.getProperty("saPassword"));
   */

   // Version for the Microsoft SQL Server driver (sqljdbc.jar):
   /*
      com.microsoft.sqlserver.jdbc.SQLServerXADataSource dataSource = new com.microsoft.sqlserver.jdbc.SQLServerXADataSource();
      dataSource.setApplicationName("TestMiniConnectionPoolManager");
      dataSource.setDatabaseName("Test");
      dataSource.setServerName("localhost");
      dataSource.setUser("sa");
      dataSource.setPassword(System.getProperty("saPassword"));
      dataSource.setLogWriter(new PrintWriter(System.out));
   */

   // Version for Oracle:
   /*
      oracle.jdbc.pool.OracleConnectionPoolDataSource dataSource = new oracle.jdbc.pool.OracleConnectionPoolDataSource();
      dataSource.setDriverType("thin");
      dataSource.setServerName("vm1");
      dataSource.setPortNumber(1521);
      dataSource.setServiceName("vm1.inventec.ch");
      dataSource.setUser("system");
      dataSource.setPassword("x");
   */

   return dataSource; }

} // end class DataSourceFactory