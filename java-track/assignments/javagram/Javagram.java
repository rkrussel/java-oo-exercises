package javagram;

import javagram.filters.*;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Javagram {

	public static void main(String[] args) {

		// Create the base path for images		
		String[] baseParts = {System.getProperty("user.dir"), "images"};
		String dir = String.join(File.separator, baseParts);
		String relPath = null;
		Picture picture = null;
		Scanner in = new Scanner(System.in);
		Menu fm = new Menu();
		Picture processed = null;
		int confirm;
		Menu ow = new Menu();
		// prompt user for image to filter and validate input
		do {
			
			String imagePath = "path not set";
			
			// try to open the file
			try {
				
				System.out.println("Image path (relative to " + dir + "):");
				relPath = in.next();
				picture = new Picture(dir + "\\" + relPath);
				imagePath = relPath;
			} catch (RuntimeException e) {
				System.out.println("Could not open image: " + imagePath);
			}
			
		} while(picture == null);
		
		Filter filter = getFilter(fm.filterMenu());
		do
		{
			try{
				// filter and display image
				processed = filter.process(picture);
				processed.show();
				System.out.println("Image successfully filtered");
				}
				catch (RuntimeException e)
				{
				System.out.println("Selection not valid");
				filter = getFilter(fm.filterMenu());
				}
				// save image, if desired
		}while(filter == null);
		
		System.out.println("Save image to (relative to " + dir + ") (type 'exit' to quit w/o saving):");
		String fileName = in.next();
		if(fileName.equals(relPath))
		{
			// TODO - if the user enters the same file name as the input file, confirm that they want to overwrite the original
		confirm = ow.overwriteMenu();
		while(confirm == 0){
			System.out.println("Invalid select yes or no");
			confirm = ow.overwriteMenu();
		}
		
		
			if(confirm == 1)
			{
			String absFileName = dir + File.separator + fileName;
			processed.save(absFileName);
			System.out.println("Image saved to " + absFileName);
			}
			else if(confirm == 2)
			{
			System.out.println("Image not saved.");
			}
			else 
			{
				
				
				confirm = ow.overwriteMenu();
				
			}
		}
		else
		{
		String absFileName = dir + File.separator + fileName;
		processed.save(absFileName);
		System.out.println("Image saved to " + absFileName);
		}
			
				
			
	// close input scanner
	in.close();
	
}
	private static Filter getFilter(int x) {
		
		
		if(x == 1)
		{
			 BlueFilter z = new BlueFilter();
			 z.getFilter();
			 return z;
		}
		else if(x == 2)
		{
			GreyFilter z = new GreyFilter();
			z.getFilter();
			return z;
		}
		else if(x == 3)
		{
			InvertFilter z = new InvertFilter();
			z.getFilter();
			return z;
		}
		
		else
		{
			return null;
		}
	}
}
