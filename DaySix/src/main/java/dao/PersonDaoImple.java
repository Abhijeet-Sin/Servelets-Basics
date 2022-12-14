package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Account;
import model.Address;
import model.Person;
import util.MyUtility;

public class PersonDaoImple implements PersonDao {

	@Override
	public void addPerson(Person person) {
		Address address =person.getAddress();
		String sql="INSERT INTO myaddress (doorno,street,city,state,country,pincode) values(?,?,?,?,?,?)";
		//This is prepared statement its more apporipriate
		
		try {
			PreparedStatement pst = MyUtility.cono().prepareStatement(sql);
			pst.setInt(1, address.getDoorNo());
			pst.setString(2, address.getStreet());
			pst.setString(3, address.getCity());
			pst.setString(4, address.getState());
			pst.setString(5, address.getCountry());
			pst.setInt(6, address.getPincode());
			pst.execute();
			System.out.println("Address added sucessfully to the database........");
			ResultSet seto =pst.executeQuery("SELECT addid FROM myaddress");
			long ido=0;
			while (seto.next()) {
				ido=seto.getLong("addid");				
			}
			seto.close();
			pst.close();
			sql="INSERT INTO person(firstname,lastname,age,email,username,password,role,address_id) values(?,?,?,?,?,?,?,?)";
			PreparedStatement ps1 =MyUtility.cono().prepareStatement(sql);
			ps1.setString(1, person.getFirstname());
			ps1.setString(2, person.getLastname());
			ps1.setInt(3, person.getAge());
			ps1.setString(4, person.getEmail());
			ps1.setString(5, person.getUsername());
			ps1.setString(6, person.getPassword());
			ps1.setString(7, person.getPassword());
			ps1.setLong(8, ido);
			ps1.execute();
			System.out.println("Person added SucessFully into the Table ...........");
			ps1.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	@Override
	public Person findPerson(String username, String password, String role) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void openAccount(Account account) {
		// TODO Auto-generated method stub
		
	}

}
