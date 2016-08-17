package tr.org.NewsPage;

import java.time.LocalDate;

public class TextPost extends post {
 String summary;

public TextPost(String title, String body, LocalDate date, String label, String category,String summary) {
	super(title, body, date, label, category);
	this.summary=summary;
	// TODO Auto-generated constructor stub
}
 
}
