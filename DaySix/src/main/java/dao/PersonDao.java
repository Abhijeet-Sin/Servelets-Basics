package dao;

import model.Account;
import model.Person;

public interface PersonDao {
	public void addPerson(Person person);
	public Person findPerson(String username,String password,String role);
	public void openAccount(Account account);

}
