package javagram;
import java.util.Scanner;
public class Menu {
	public int input;
	Scanner s = new Scanner(System.in);
	int filterMenu()
	{
		System.out.println("Select a filter:");
		System.out.println("1. Blue Filter");
		System.out.println("2. Black and white filter:");
		System.out.println("3. Invert Filter.");
		int selection = s.nextInt();
		
		return selection;
	};
	public int overwriteMenu(){
		System.out.println("Are you sure you want to overwrite this file?");
		System.out.println("1. Yes.");
		System.out.println("2. No.");
		int confirm = s.nextInt();
		if (confirm != 1 & confirm != 2)
		{
		return 0;
		}
		else
		{
		return confirm;
		}
	}
	
	public Menu(){
	}
	
}
