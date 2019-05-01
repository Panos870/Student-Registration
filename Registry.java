
import java.util.*;
import java.lang.Object;

public class Registry 
{
	LinkedList<Student> studentList;
	ListIterator<Student> iterator;
	
	public Registry()
	{
		studentList = new LinkedList<Student>();
	
	}
	
	public void addStudent(Student aStudent) 
	{
		studentList.addLast(aStudent);
	}
	
	public void deleteStudent(String studentID) 
	{
		iterator = studentList.listIterator();
		while(iterator.hasNext())
		{
			if(iterator.next().getID().equals(studentID))
			{
				iterator.remove();
			}
		}
	}
	
	public String toString() 
	{
		String s = getClass().getName(); 
		
		for (Student st : studentList)
		{
			s = s + "\n->" + st.toString();
		}
		
		return s;		
	}
	
	public String format() 
	{	
		String s = "";
		for (Student st : studentList) 
		{
			s = s + String.format("%s %s \t\t %s \t %s \n", st.getFName(), st.getSName(), st.getID(), st.getDegree());
		}
		return s;
	}
}
