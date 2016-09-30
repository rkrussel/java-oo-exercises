package Studio1;

public class Rectangle 
{
	
	private int length;
	private int width;
	
	public Rectangle(int length, int width){
		this.length = length;
		this.width = width;
	}
	public int getLength(){
		return this.length;
	}
	public int getWidth(){
		return this.width;
	}
	public int getArea(){
		return this.length * this.width;
	}
	public int getPerimeter(){
		return this.length * 2 + this.width * 2;
	}
	public boolean compareSize(int compared)
	{
		if (this.getArea() < compared){
			return false;
		}
		else 
		{
			return true;
		}
	}
	
	public boolean isSquare()
	{
		if(this.length == this.width)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	public static void main(String[] args)
	{
	
		
		Rectangle test = new Rectangle(20, 20);
		System.out.println(test.getArea());
	}
}


