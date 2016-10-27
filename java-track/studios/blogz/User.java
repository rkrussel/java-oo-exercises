package blogz;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.regex.Matcher;


public class User extends Entity{
	private String name;
	private String hashedPassword;
	private static String hashPassword(String pw){
		return pw;
	}
	public boolean isValidUser()
	{
		  String pattern = "[a-zA-Z][a-zA-Z0-9_-]{4,11}";
		  Pattern r = Pattern.compile(pattern);
		  Matcher m = r.matcher(this.name);
		  boolean b = m.matches();
		  return b;
	}
	public User(String name, String password){
		super();
		this.name = name;
		this.hashedPassword = hashPassword(password);
		isValidUser();
		
	}
	public String getName(){
		return this.name;
	}
	public String getHashedPassword(){
		return this.hashedPassword;
	}
	public static ArrayList<User> userList = new ArrayList<User>();
	public static ArrayList<User> getUserList()
	{
		return userList;
	}
	
					
		
	
}
