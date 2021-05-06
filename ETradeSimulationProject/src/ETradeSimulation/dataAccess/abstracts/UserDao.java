package ETradeSimulation.dataAccess.abstracts;

import java.util.ArrayList;


import ETradeSimulation.entities.concretes.User;

public interface UserDao  {

	void register(User user);
	
	void logIn(User user);
	
	ArrayList<User> getRegisteredUsers();
	
	
	boolean ifEmailIsUsed(User user);
}
