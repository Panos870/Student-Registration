
public class Student 
{
/**
 * @Variables: Instances
 */
	private String foreName;
	private String surName;
	private String studentID;
	private String degreeScheme;
	
/**
 * @Constructor: Empty constructor	
 */
	public Student()
	{
		foreName = null;
		surName = null;
		studentID = null;
		degreeScheme = null;
	}
	
/**
 * @Constructor: Parameterised
 * @param String	
 */
	public Student(String foreName, String surName, String studentID, String degreeScheme)
	{
		this.foreName = foreName;
		this.surName = surName;
		this.studentID = studentID;
		this.degreeScheme = degreeScheme;		
	}
	
/**Getter Methods
 * @param fName
 * @param sName
 * @param id
 * @param degree
 */
	public void setFName(String fName)
	{
		this.foreName = fName;
	}
	
	public void setSName(String sName)
	{
		this.surName = sName;		
	}
	
	public void setID(String id)
	{
		this.studentID = id;		
	}
	
	public void setDegree(String degree)
	{
		this.degreeScheme = degree;
	}
	
/**Getter Methods
 * @return foreName
 * @return surName
 * @return studentID
 * @return degreeScheme
 */	
	public String getFName()
	{
		return this.foreName;
	}
	
	public String getSName()
	{
		 return this.surName;		
	}
	
	public String getID()
	{
		return this.studentID;		
	}
	
	public String getDegree()
	{
		return this.degreeScheme;
	}

/**
 * 	@return toString()
 */
	public String toString()
	{
		return getClass().getName() + "[Name: " + this.foreName + " " + this.surName + ", ID: " + this.studentID + ", Degree: " + this.degreeScheme + "]";
	}
}
