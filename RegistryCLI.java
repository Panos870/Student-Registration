
import java.util.Scanner;
public class RegistryCLI 
{
	private Registry theRegistry;
	
	/**
	 * @param theRegistry
	 */
	public RegistryCLI(Registry theRegistry)
	{
		this.theRegistry = theRegistry;
	}

	/**
	 * @param student data
	 */
	public void doMenu() 
	{	
		Scanner in = new Scanner(System.in);
		String exit = "no";
		while(exit.equals("no")) 
		{
			int option = 0;
			System.out.println("Registry Main Menu");
			System.out.println("******************");
			System.out.println("1. Add a Student");
			System.out.println("2. Delete a Student");
			System.out.println("3. Print Registry");
			System.out.println("4. Quit");
			option = in.nextInt();
			
			switch(option)
			{
				case 1: 
				{
					doAddStudent(); 
					break;
				}
				case 2: 
				{
					doDeleteStudent(); 
					break;
				}
				case 3: 
				{
					doPrintRegistry(); 
					break;
				}
				case 4: 
				{
					System.out.println("Exit");
					break;
				}
				default :
				{
					System.out.println("Invalid Choice.\n");
					break;
				}
			}
			
			System.out.println("Would you like to exit? yes/no");
			exit = in.next();
		}
		
		System.out.println("Thank you, have a nice day :)");
	}
	
	/**
	 * @param adding student data
	 */
	private void doAddStudent()
	{	
		Scanner in = new Scanner(System.in);
		Student s;
		String newData = "yes";
		String fName;
		String sName;
		String id;
		String degree;
		
		while (newData.equals("yes"))
		{
			System.out.println("Add New Student");
			System.out.println("***************");
			
			System.out.println("Enter forname :> ");
			fName = in.nextLine();
			
			System.out.println("Enter surname :> ");
			sName = in.nextLine();
			
			
			System.out.println("Enter student ID :> ");
			id = in.nextLine();
			
			System.out.println("Enter degree scheme :> ");
			degree = in.nextLine();
			
			s = new Student(fName, sName, id, degree);			
			theRegistry.addStudent(s);
			
			System.out.println("Enter another (yes/no)\t:> ");
			newData = in.nextLine();
		}
	}
	
	/**
	 *@return deletes the data
	 */
	private void doDeleteStudent() 
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the student ID, you wish  to delete : ");
		String stDel = in.nextLine();
		theRegistry.deleteStudent(stDel);		
	}
	
	/**
	 * @return formatted version of the data
	 */
	private void doPrintRegistry() 
	{
		String s = theRegistry.format();
		System.out.println(s);
	}
}
