package ETradeSimulation.signupUsingAccounts.concretes;

import ETradeSimulation.signupUsingAccounts.abstracts.SignUpUsingAccountService;

public class GoogleSignUpManager implements SignUpUsingAccountService{

	@Override
	public void SignUp(String email, String password) {
		System.out.println("You signed up using Google Account");
		
	}

}
