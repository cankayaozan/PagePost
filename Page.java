package tr.org.NewsPage;

import java.time.LocalDate;

public class Page {

	String title,body,label,category,comments;
	LocalDate date;
	public Page(String title,String body,LocalDate date,String label,String category){
		this.title=title;
		this.body=body;
		this.date=date;
		this.label=label;
		this.category=category;
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	
	

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}
	
	
}
