package ETradeSimulation.core.Logger;

import ETradeSimulation.entities.concretes.User;

public class EmailLogger implements LoggerService{

	@Override
	public void log( User user) {
		System.out.println("Dear " + user.getName() + ", an confirmation email has been sent to you");
		
	}

}
