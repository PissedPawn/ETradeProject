package ETradeSimulation.business.abstracts;

public interface ConfirmationLinkService {

	void SendLink(String email);
	
	boolean Confirm(boolean condition);
	
}
