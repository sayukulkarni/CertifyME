package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;

public class Databasetest {

	public static void main(String[] args) {
		

		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root","root");
			
			/*Statement stmp =  con.createStatement();
			ResultSet rs = stmp.executeQuery("select * from student");
			while (rs.next())
				System.out.println(rs.getInt(1)+" "+rs.getString(2));*/
			
			
			String query = " Insert into student (sid,sname) values(?,?)";
			
			// create the mysql insert preparedstatement
			PreparedStatement preparedStmt = (PreparedStatement) con.prepareStatement(query);
			preparedStmt.setString(1, "101");
			preparedStmt.setString(2, "demo");
			preparedStmt.execute();
			
			
			con.close();

		} catch (Exception e) {
			System.out.println(e);

		}

	}

}
