package ETradeSimulation.core.emailValidation;

import ETradeSimulation.RegexEmailValidator.RegexValidator;

public class RegexValidatorAdapter implements EmailValidationService {
	
	public boolean ifEmailIsValid(String email)
	{
		RegexValidator regex=  new RegexValidator();
		
		if(regex.validate(email))
			return true;
		else
		{
			System.out.println("email not valid");
			return false;
		}
			
	}

}
