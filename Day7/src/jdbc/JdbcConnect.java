package jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JdbcConnect {
		
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","admin");
			
			Statement st = con.createStatement();
//			st.execute("create table emp(id int, name varchar(30))");
//			st.execute("insert into emp(id,name) values(1,'tapu')");
//			Object a = st.execute("select * from emp");\
			
			ResultSet rs= st.executeQuery("select * from emp");
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1) + " : "+rs.getString("name"));
			}
			
			con.close();
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		

	}
	

}
