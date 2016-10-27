package blogz;

import java.sql.Date;

public class Post extends Entity{
	private String title;
	private String body;
	private User author;
	private Date modified;
	private final Date created;
	public Post(String body, String title, Date date){
		super();
		this.body = body;
		this.title = title;
		this.created = date;
	}
	public void updateTitle(String newTitle, Date date){
		this.title = newTitle;
		this.modified = date;
	}
	public void updateBody(String update, Date date){
		this.body = update;
		this.modified = date;
	}
}
