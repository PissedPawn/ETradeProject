package ETradeSimulation.entities.concretes;



import ETradeSimulation.entities.abstracts.Person;

public class User implements Person{

	private String name;
	private String lastName;
	
	private String emailAdress;
	
	private String password;
	
	
	

	
	public User() {}

	public User(String name, String lastName, String emailAdress, String password) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.emailAdress = emailAdress;
		this.password = password;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailAdress() {
		
		
		return emailAdress;
	}

	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
