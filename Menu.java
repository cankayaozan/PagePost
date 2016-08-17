package tr.org.NewsPage;

public class Menu {

	
	public static void printMenu(){
		StringBuilder menu=new StringBuilder(50);
		int index=0;
		int index2=0;
		
		menu.append("OPTIONS\n");
		menu.append("*********\n");
		menu.append("\n");

		menu.append("1)  For Add page\n");
		menu.append("2)  For Add post\n");
		menu.append("3)  For Add comment\n");
		menu.append("4)  For Show pages\n");
		menu.append("5)  For Show post\n");
		menu.append("6)  For Export\n");
		menu.append("\n");
		
		while(PageHelper.pages.size()>index){
		menu.append(". page is "+PageHelper.pages.get(index).title+"\n");
		
		index++;
		}
		
		while(PageHelper.posts.size()>index2){
			menu.append(". post is "+PageHelper.posts.get(index2).title+"\n");
			
			index2++;
			}
			
		

		System.out.println(menu);

		
		
	}
}
