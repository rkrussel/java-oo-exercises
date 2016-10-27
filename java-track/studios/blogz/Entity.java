package blogz;

public abstract class Entity {
	private int uidCount = 0;
	private final int uid;
	private int getUid(){
		 
		 return this.uid;
	}
	
	public Entity(){
		 this.uid = this.uidCount;
		 this.uidCount++;
	}
}
