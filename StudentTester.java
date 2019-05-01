
public class StudentTester {

	public static void main(String[] args) 
	{
/**
 * @Testing empty constructor
 * @Testing getters and setters		
 */
		Student s1 = new Student();
		s1.setFName("Steve");
		s1.setSName("Marriott");
		s1.setID("1001PG");
		s1.setDegree("BSc Mathematics");
		System.out.print("Testing getter methods\n");
		System.out.print(s1.getFName());
		System.out.print(" " + s1.getSName());
		System.out.print("\t" + s1.getID());
		System.out.print("\t" + s1.getDegree());
/**
 * @Testing Parameterised constructor
 * @Testing toString() method (Overriding toString() method)
 */
		Student s2 = new Student("Sean", "Crossan", "1002PG", "BSc Computer Science");	
		//Student s3 = new Student("Alan", "McLachlan", "1003UG", "BSc Computer Information Systems");
		
		System.out.println("\n\nTesting toString method");
		System.out.println(s1.toString());
		System.out.println(s2.toString());
	}

}
