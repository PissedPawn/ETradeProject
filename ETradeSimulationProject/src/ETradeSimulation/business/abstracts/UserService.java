package ETradeSimulation.business.abstracts;

import ETradeSimulation.entities.concretes.User;

public interface UserService {
	
    void register(User user);
	
	void logIn(User user);

}
