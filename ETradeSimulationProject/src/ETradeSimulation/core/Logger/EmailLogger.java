package ETradeSimulation.core.Logger;

import ETradeSimulation.business.abstracts.ConfirmationLinkService;
import ETradeSimulation.entities.concretes.User;

public class EmailLogger implements LoggerService{

	private ConfirmationLinkService confirmationLinkService;
	
	public EmailLogger(ConfirmationLinkService confirmationLinkService)
	{
		this.confirmationLinkService= confirmationLinkService;
	}
	@Override
	public void log( User user) {
		System.out.println("Dear " + user.getName() + ", an confirmation email has been sent to you");
		confirmationLinkService.SendLink(user.getEmailAdress());
		
	}

}
