package BookJDBC;

import BookJDBC.daoimpl.DBConnection;
import junit.framework.Assert;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TestDBConnection {
	
	@Test
	public void testExecuteQuery() throws SQLException {
		DBConnection instance = DBConnection.getInstance();
		
		String username = "yqyykgh";
		
		instance.execute("INSERT INTO `test`.`users` (`first_name`, `last_name`, `username`, `password`, `type`) VALUES ('yqyykghp', 'yqyykghp','"+username + "', 'acUn3t1x', 'NORMAL')");
		
		ResultSet executeQuery = instance.executeQuery("select * from Users where username='" + username + "'");
		
		Assert.assertNotNull(executeQuery);
		Assert.assertNotNull(executeQuery.next());
		
		instance.execute("DELETE FROM `test`.`users` WHERE `username`='" + username + "'");
	}
	
	@Test
	public void testExecute() throws SQLException {
		DBConnection instance = DBConnection.getInstance();
		
		String username = "yqyykgh";
		
		instance.execute("INSERT INTO `test`.`users` (`first_name`, `last_name`, `username`, `password`, `type`) VALUES ('yqyykghp', 'yqyykghp','"+username + "', 'acUn3t1x', 'NORMAL')");
		
		ResultSet executeQuery = instance.executeQuery("select * from Users where username='" + username + "'");
		
		Assert.assertNotNull(executeQuery);
		Assert.assertNotNull(executeQuery.next());
		
		instance.execute("DELETE FROM `test`.`users` WHERE `username`='" + username + "'");
	}

}
