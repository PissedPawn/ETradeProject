package ETradeSimulation;

import ETradeSimulation.business.abstracts.ConfirmationLinkService;
import ETradeSimulation.business.abstracts.UserService;
import ETradeSimulation.business.concretes.ConfirmationLinkManager;
import ETradeSimulation.business.concretes.UserManager;
import ETradeSimulation.core.Logger.EmailLogger;
import ETradeSimulation.core.Logger.LoggerService;
import ETradeSimulation.core.emailValidation.RegexValidatorAdapter;
import ETradeSimulation.dataAccess.concretes.HibernateUserDao;

import ETradeSimulation.entities.concretes.User;
import ETradeSimulation.signupUsingAccounts.concretes.GoogleSignUpManager;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ConfirmationLinkService confirmatioinLinkService=  new ConfirmationLinkManager();
		LoggerService[] loggers=  new LoggerService[]
				{
						new EmailLogger(confirmatioinLinkService),
				};
		
		User user = new User("Vuqar","Rahimli","rahimlivuqar@gmail.com", "vuqar123456789");
		
		
		
		
		User user2 = new User("Ali","Rahimli","rahimlivuqar@gmail.com", "vuqar123456789");
		
		User user3 = new User("Tolga","Rahimli","rahimlivuqar@..gmail.com", "vuqar123456789");
		
		UserService userService=  new UserManager(new HibernateUserDao(),
				new RegexValidatorAdapter(),
				loggers);
		
		
			
			
		
		
		userService.register(user); // normal register successful
		
		confirmatioinLinkService.Confirm(false); // confirmation link
		
		userService.register("theBoolean@gmail.com", "ahsbjhsdjsd654153", new GoogleSignUpManager()); // register using google ?
		
		userService.register(user2); // email has been used
		
		userService.register(user3);// email not valid
		
		userService.logIn(user.getEmailAdress(), user.getPassword()); // user logged in successfully
		
		userService.logIn(user3.getEmailAdress(), user3.getPassword()); // user can not be found
		
		
		

	}

}     /////////////
