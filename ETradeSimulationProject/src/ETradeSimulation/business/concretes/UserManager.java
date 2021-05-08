package ETradeSimulation.business.concretes;

import ETradeSimulation.business.abstracts.UserService;
import ETradeSimulation.core.Logger.LoggerService;
import ETradeSimulation.core.emailValidation.EmailValidationService;
import ETradeSimulation.dataAccess.abstracts.UserDao;
import ETradeSimulation.entities.concretes.User;
import ETradeSimulation.signupUsingAccounts.abstracts.SignUpUsingAccountService;

public class UserManager implements UserService {

	private UserDao userDao;
	private EmailValidationService validationService;
	private LoggerService[] loggerServices;

	public UserManager(UserDao userDao, EmailValidationService validationService, LoggerService[] loggerServices) {
		this.userDao = userDao;
		this.validationService = validationService;
		this.loggerServices = loggerServices;
	}

	@Override
	public void register(User user) {
		if (user.getName().length() <= 2 || user.getLastName().length() <= 2 || user.getPassword().length() <= 6
				|| !validationService.ifEmailIsValid(user.getEmailAdress()) || userDao.ifEmailIsUsed(user)) {
			System.out.println("Values are not correct");
			return;
		}

		userDao.register(user);

		LogToSystem(user);

	}

	@Override
	public void logIn(String email, String password) {

		userDao.logIn(email, password);
	}

	void LogToSystem(User user) {
		for (LoggerService loggerService : loggerServices) {
			loggerService.log(user);
		}
	}

	@Override
	public void register(String email, String password, SignUpUsingAccountService signUpService) {
		if (validationService.ifEmailIsValid(email)) {
			signUpService.SignUp(email, password);
			return;

		} else {
			System.out.println("Enter a valid email");
		}

	}

}
