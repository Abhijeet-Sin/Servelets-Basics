package model;

public class Person {
	private Address address;
	private long pd;
	private String firstname;
	private String lastname;
	private int age;
	private String email;
	private String username;
	private String password;
	private String role;
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public long getPd() {
		return pd;
	}
	
	public void setPd(long pd) {
		this.pd = pd;
	}
	
	public String getFirstname() {
		return firstname;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getRole() {
		return role;
	}
	
	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Person [address=" + address + ", pd=" + pd + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", age=" + age + ", email=" + email + ", username=" + username + "]";
	}

	

}
