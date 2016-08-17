package tr.org.NewsPage;

import java.time.LocalDate;
import java.util.Scanner;

public class Application {
	
	
	public static void main(String[] args) {
		boolean  temp=true;
		Scanner input = new Scanner(System.in);

		
		PageHelper ph= new PageHelper();
		

    while(temp){
    	Menu.printMenu();
    	int command=input.nextInt();
    	int index=0;
    	
    	switch(command){
    	
    	case 1:
    		
    		System.out.println("title giriniz");
    		String title= input.next();
    		
    		System.out.println("bodtye giriniz");
    		String body= input.next();
    		
    		LocalDate date = LocalDate.now();
    		
    		System.out.println("label giriniz");
    		String label= input.next();
    		
    		System.out.println("category giriniz");
    		String category= input.next();
    		
    		Page page= new Page(title,body,date,label,category);
    		ph.addPage(page);
    		
        	Menu.printMenu();

    		break;
    		
    		
    	case 2:
    		System.out.println("press v for videoPost ,  t for textPost");
    		String postType= input.next();
    		
    	  		
    		if(postType.equals("v")){
    			System.out.println("post title giriniz");
        		String postTitle= input.next();
        		
        		System.out.println("bodtype giriniz");
        		String postBody= input.next();
        		
        		LocalDate postDate = LocalDate.now();
        		
        		System.out.println("post label giriniz");
        		String postLabel= input.next();
        		
        		System.out.println("post category giriniz");
        		String postCategory= input.next();
        		
    			System.out.println("bir url giriniz efenim");
    			String url= input.next();
    			
        		
    			VideoPost vp= new VideoPost( postTitle,  postBody, postDate,  postLabel,  postCategory, url);
    			ph.addPost(vp);
            
    		}
    		else if(postType.equals("t")){
    			
    			System.out.println("post title giriniz");
        		String postTitle= input.next();
        		
        		System.out.println("post bodtye giriniz");
        		String postBody= input.next();
        		
        		LocalDate postDate = LocalDate.now();
        		
        		System.out.println("post label giriniz");
        		String postLabel= input.next();
        		
        		System.out.println("category giriniz");
        		String postCategory= input.next();
        		
    			String url= input.nextLine();
    			System.out.println("bir summary giriniz efenim");
    			String summary= input.nextLine();

    			TextPost tp= new TextPost(postTitle,  postBody, postDate,  postLabel,  postCategory, summary);
    			ph.addPost(tp);
    	}
    		else 
    			return;
    		
        	Menu.printMenu();

    		break;
    	
    	case 3:
    		System.out.println("choose post number to comment");
    		int postNumber= input.nextInt();
    		System.out.println("sectiginiz post: "+ph.posts.get(postNumber-1).getTitle());
    		
    		System.out.println("comment authoru giriniz");
    		String author= input.next();
    		
    		System.out.println("comment texti giriniz");
    		String text= input.next();
    		LocalDate commentDate= LocalDate.now();
    		Comment comment = new Comment(author,text,commentDate);
    		PageHelper.addComment(comment, postNumber-1);
    		
        	Menu.printMenu();

    		break;
    		
    	}
    	
    	
//    	System.out.println("kapatmak için k ye basýn");
//    	String d=input.next();
//    	if(d=="k"){
//    		temp=false;
//    	}
//    	else
//    		;
    	
    }
			
			

		}

	}
	

