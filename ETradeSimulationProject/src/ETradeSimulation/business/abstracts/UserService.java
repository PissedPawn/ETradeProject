package ETradeSimulation.business.abstracts;

import ETradeSimulation.entities.concretes.User;
import ETradeSimulation.signupUsingAccounts.abstracts.SignUpUsingAccountService;


public interface UserService {
	
    void register(User user);
    
    void register(String email, String password,  SignUpUsingAccountService signUpService);
	
	void logIn(String email, String password);

}
