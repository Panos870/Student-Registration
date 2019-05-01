
public class RegistryApp 
{
	public static void main(String[] args)
	{
		/**
		 * Creating new registry
		 */
		Registry theRegistry = new Registry();
	
		/**
		 * Creating RegistryCLI of type registry
		 */
		RegistryCLI theRegistryCLI = new RegistryCLI(theRegistry);
	
		/**
		 * Starting the main menu
		 */
		theRegistryCLI.doMenu();
	}
}
