package tr.org.NewsPage;

import java.time.LocalDate;

public class Comment {

	String author,text;
	LocalDate date= LocalDate.now();
	
	public Comment(String author, String text, LocalDate date){
		this.author=author;
		this.text=text;
		this.date=date;
		
	}
}
