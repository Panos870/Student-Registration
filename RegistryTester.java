
public class RegistryTester
{
	public static void main(String[] args) 
	{
		/**
		 * @Param Student data
		 */
		Registry r = new Registry();
		Student s1 = new Student("Steve", "Marriott", "1001PG", "BSc Mathematics");
		Student s2 = new Student("Sean", "Crossan", "1002PG", "BSc Computer Science");
		Student s3 = new Student("Alan", "McLachlan", "1003UG", "BSc Computer Information Systems");
		
		/**
		 * @return Student data created & stored
		 */
		System.out.println("Register Tester\n" + "***************");
		System.out.println("\nTest 1. Check if student list contains three students.\n" + "Methods tested: constructor and format ");
		System.out.println("\nExpected:");
		System.out.println(s1.getFName() + " " + s1.getSName() + " \t\t " + s1.getID() + "\t\t " + s1.getDegree());
		System.out.println(s2.getFName() + " " + s2.getSName() + " \t\t " + s2.getID() + "\t\t " + s2.getDegree());
		System.out.println(s3.getFName() + " " + s3.getSName() + " \t\t " + s3.getID() + "\t\t " + s3.getDegree());
		
		/**
		 * @return Null after deleting all data
		 */
		System.out.println("\nTesting \"deleteStudent\" method\n");
		r.deleteStudent("1001PG");
		r.deleteStudent("1002PG");
		r.deleteStudent("1003PG");
		System.out.println(r.format());
		
		/**
		 * @param Creating student data again
		 * @return formatted student's data 
		 */
		System.out.println("\nActual:");
		r.addStudent(s1);
		r.addStudent(s2);
		r.addStudent(s3);
		System.out.println(r.format());
		
		/**
		 * @return overriding toString method to display student data
		 */
		System.out.println("\nTesting toString method");
		System.out.println(r.toString());
		
		/**
		 * @return All data apart from the deleted one
		 */
		System.out.println("\nTesting \"deleteStudent\" method, again\n");
		r.deleteStudent("1002PG");
		System.out.println(r.format());
	}

}
