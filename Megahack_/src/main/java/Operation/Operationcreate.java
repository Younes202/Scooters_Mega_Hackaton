package Operation;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.sql.*;

import Beans.Client;
public class Operationcreate {
	ArrayList<Client> Clients = new  ArrayList<Client>();

	public ArrayList<Client> getClients() {
		return Clients;
	}

	public void setClients(ArrayList<Client> clients) {
		Clients = clients;
	}
	public void adding(Client cl) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Clients","root","missour.1422");
			PreparedStatement st = con.prepareStatement("insert into products values(NULL,?,?,?,?)");
			st.setString(1, p.getName());
			st.setString(2, p.getDesc());
			st.setFloat(3, p.getPrice());
			st.setInt(4, p.getEtat());
			st.executeUpdate();
			con.close();

			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
