package ETradeSimulation.business.concretes;

import ETradeSimulation.business.abstracts.ConfirmationLinkService;

public class ConfirmationLinkManager implements ConfirmationLinkService{

	@Override
	public void SendLink(String email) {
		System.out.println("Confirmation link has been sent to " + email+ ", Click the link to activate account");
		
	}

	@Override
	public boolean Confirm(boolean condition) {
		
		if(condition)
		{
			System.out.println("Account has been activated");
			return true;
		}
		
		System.out.println("your activation link expired");
		return false;
	}

}
