package ETradeSimulation;

import ETradeSimulation.business.abstracts.UserService;
import ETradeSimulation.business.concretes.UserManager;
import ETradeSimulation.core.Logger.EmailLogger;
import ETradeSimulation.core.Logger.LoggerService;
import ETradeSimulation.core.emailValidation.RegexValidatorAdapter;
import ETradeSimulation.dataAccess.concretes.HibernateUserDao;

import ETradeSimulation.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoggerService[] loggers=  new LoggerService[]
				{
						new EmailLogger(),
				};
		
		User user = new User("Vuqar","Rahimli","rahimlivuqar@gmail.com", "vuqar123456789");
		
		
		
		
		User user2 = new User("Ali","Rahimli","rahimlivuqar@gmail.com", "vuqar123456789");
		
		User user3 = new User("Tolga","Rahimli","rahimlivuqar@..gmail.com", "vuqar123456789");
		
		UserService userService=  new UserManager(new HibernateUserDao(),
				new RegexValidatorAdapter(),
				loggers);
			
			
		
		
		userService.register(user);
		
		userService.register(user2);
		
		userService.register(user3);
		
		

	}

}     ////////
