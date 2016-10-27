

public class Course {
	private String name;
	private int seats;
	private int credits;
	private Student[] roster;
	private int counter;
	//constructor
	public Course(String name, int credits, int seats)
		{
		this.name = name;
		this.seats = seats;
		this.credits = credits;
		this.roster = new Student[seats];
		this.counter = 0;
		}
	public String getName()
	{
		return this.name;
	}
	public int getRemainingSeats()
	{
		
		return this.seats;
	}
	public int getCredits()
	{
		return this.credits;
	}
	public boolean addStudent(Student name)
	//check if student is already in the course
	{
		for(int i = 0; i < this.roster.length; i++)
		{
			if (this.roster[i] == name)
			{
				return false;
			}
			
		}
		//if student is not already in the class
		//check remaining seats and add to roster.
		if(this.counter < this.roster.length)
		{
			this.roster[counter] = name;
			this.seats -= 1;
			this.counter += 1;
			return true;	
		}
			else
		{
			return false;
		}
	}
	public String generateRoster()
	{
		String enrolled = "";
		for(int i = 0; i < this.counter; i++)
		{
			enrolled += this.roster[i].getName();
		}
		return enrolled;
	}
	public double averageGPA()
	{
		double gpaCounter = 0;
		for(int i = 0; i < this.counter; i++)
		{
			gpaCounter += this.roster[i].getGPA();
		}
		return gpaCounter / this.counter;
	}
	public String toString()
	{
		return this.getName() + " " + this.getCredits();
	}
}




