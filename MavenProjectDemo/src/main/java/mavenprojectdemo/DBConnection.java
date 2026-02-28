package mavenprojectdemo;
import java.sql.Connection;
import java.sql.SQLException;

import oracle.jdbc.datasource.OracleCommonDataSource;
import oracle.jdbc.pool.OracleDataSource;

public class DBConnection {
	public static Connection getConnection() throws SQLException {
	        OracleDataSource ds = new OracleDataSource();
	        ds.setURL("jdbc:oracle:thin:@localhost:1521:xe");
	        ds.setUser("scott");
	        ds.setPassword("tiger");
	        return ds.getConnection();
		
	}

}
