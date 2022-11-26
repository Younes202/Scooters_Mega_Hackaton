import java.sql.*;
import Beans.Client;
import jakarta.servlet.ServletException;
public class TestS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client cl = new Client(1,"aza","zaz","eze","zaz","zaz","zaz","zaz","zaz");
		 
			try {
				Class.forName("org.mariadb.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mariadb://localhost:3306/Scooters","root","missour.1422");
				PreparedStatement st = con.prepareStatement("insert into Clients values(NULL,?,?,?,?,?,?,?,?)");
				st.setString(1,cl.getFullname());
				st.setString(2,cl.getUesrname());
				st.setString(3,cl.getEmail());
				st.setString(4,cl.getPhone());
				st.setString(5,cl.getAddress());
				st.setString(6,cl.getPassword());
				st.setString(7,cl.getGender());
				st.setString(8,cl.getType());
				st.executeUpdate();
				con.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		


	}}
