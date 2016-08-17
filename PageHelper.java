package tr.org.NewsPage;

import java.util.ArrayList;

public class PageHelper {

	public static ArrayList<Page> pages= new ArrayList<>();
    public static ArrayList<post> posts= new ArrayList<>();
    public static ArrayList<Comment> comments= new ArrayList<>();
	
	public static void addPage(Page page){
		pages.add(page);
	}
		
		public static void removePage(int index) {
			Page page =pages.get(index);
			pages.remove(page);
		
	}
		public static void addPost(post post){
			posts.add(post);
		}
		public static void removePost(int index) {
			Page post =posts.get(index);
			posts.remove(post);
		
	}
		public static void addComment(Comment comment,int index){
			comments.add(index, comment);
			
		}
			
	
}
