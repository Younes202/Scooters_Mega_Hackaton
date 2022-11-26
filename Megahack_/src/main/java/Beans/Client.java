package Beans;

public class Client {
	int id;
	String Fullname;
	String Uesrname;
	String Email;
	String Phone;
	String Address;
	String password;
	String Gender;
	String Type;
	public Client(int id, String fullname, String uesrname, String email, String phone, String address, String password,
			String gender, String type) {
		super();
		this.id = id;
		Fullname = fullname;
		Uesrname = uesrname;
		Email = email;
		Phone = phone;
		Address = address;
		this.password = password;
		Gender = gender;
		Type = type;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullname() {
		return Fullname;
	}
	public void setFullname(String fullname) {
		Fullname = fullname;
	}
	public String getUesrname() {
		return Uesrname;
	}
	public void setUesrname(String uesrname) {
		Uesrname = uesrname;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getType() {
		return Type;
	}
	
	public void setType(String type) {
		Type = type;
	}

}
