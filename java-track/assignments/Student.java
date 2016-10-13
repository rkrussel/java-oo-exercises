
public class Student {
	private String firstName;
	private String lastName;
	private int studentID;
	private int credits;
	private double GPA;
	private double gpaTotal;
	public Student(String firstName, String lastName, int studentID)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentID = studentID;
		this.GPA =0.0;
		this.credits = 0;
	}
	public String getName()
	{
		return this.firstName + " " + this.lastName;
	}
	public double getGPA()
	{
		return GPA;
	}
	public int getCredits()
	{
		return this.credits;
	}
	public int getStudentID()
	{
		return this.studentID;
	}
	public String getClassStanding()
	{
		if (this.credits < 30)
			{return "Freshman";}
		else if ( this.credits < 60)
			{return "Sophomore";}
		else if (this.credits < 90)
			{return "Junior";}
		else
			{return "Senior";}
	}
	public void submitGrade(double g, double credits)
	{
		if (g >= 5 | g < 0)
			{return;}
		this.credits += credits;
		double qualityScore =  g * credits;	
		
		this.gpaTotal += qualityScore;
		this.GPA = gpaTotal / this.credits;
		this.GPA = Math.round(this.GPA * 1000.0) / 1000.0;
	}
	public double computeTuition()
	{
		int semesters = this.credits / 15;		
		int extra = this.credits % 15;		
		return semesters * 20000.0 + extra * 1333.33;		
	}
	public Student createLegacy(Student p1, Student p2)
	{
		Student child = new Student(p1.getName(), p2.getName(), p1.studentID + p2.studentID);
		child.credits = Math.max( p1.getCredits(), p2.getCredits());
		child.GPA = (p1.getGPA() + p2.getGPA()) / 2;
		return child;
	}
	public String toString()
	{
		return this.getName() + " " + this.studentID;
	}
}
	
