package Studio1;

public class Player {
	private String name;
	private int jersey;
	private int totalHits;
	private int totalRBIs;
	private int totalGames;
	private int totalRuns;
	private char stance;
	
	public Player(String name, int jersey)
	{
		this.name = name;
		this.jersey = jersey;
	}
	public void setStance(char stance)
	{
		if (stance == 'L' || stance == 'R' || stance == 'S')
		{
			this.stance = stance;
		}
		else
		{
			return;
		}			
	}
	public void gameTotals(int hits, int runs, int rbis)
	{
		this.totalHits += hits;
		this.totalRBIs += rbis;
		this.totalRuns += runs;
		this.totalGames += 1;
	}
	

	public static void main(String[] args) 
	{
		
	}

}
