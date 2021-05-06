package ETradeSimulation.dataAccess.concretes;



import java.util.ArrayList;


import ETradeSimulation.dataAccess.abstracts.UserDao;

import ETradeSimulation.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	
	private ArrayList<User> registeredUsers;
	
	public HibernateUserDao()
	{
		registeredUsers= new ArrayList<User>();
	}
	
	
	@Override
	public void register(User user) {
		System.out.println("User registered succesfully: " + user.getName());
		registeredUsers.add(user);
	}

	@Override
	public void logIn(User user) {
		// TODO Auto-generated method stub
		
	}
	
	public ArrayList<User> getRegisteredUsers()
	{
		return registeredUsers;
	}



	


	@Override
	public boolean ifEmailIsUsed(User user) {
		for(User _user: registeredUsers)
		{
			if(_user.getEmailAdress()==user.getEmailAdress())
			{
				System.out.println("email has been used");
				return true;
			}
				
			
			return false;
		}
		
		
		
		
		return false;
	}

}
