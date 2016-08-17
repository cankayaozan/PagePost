package tr.org.NewsPage;

import java.time.LocalDate;

public class VideoPost extends post {
	
	String url;

public VideoPost(String title, String body, LocalDate date, String label, String category,String url) {
		super(title, body, date, label, category);
		this.url=url;
		// TODO Auto-generated constructor stub
	}


}
