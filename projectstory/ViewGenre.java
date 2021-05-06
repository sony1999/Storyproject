package projectstory;

import java.util.ArrayList;
import java.util.Iterator;

public class ViewGenre {
	/*
	 * genre() :  in this method, we create a array list .
	 * 			  based on the option selected ,we send the list to another method 
	 * 			  and gets the details of the genre
	 */
	public String genre(int option,StoryDatabase sd) {
		StringBuilder sb=new StringBuilder();
		ArrayList<Story> genre=new ArrayList<>();
		if(option==1) {
			genre=sd.fantasy_list();
			sb.append(story_details(genre));
		}
		else {
			genre=sd.fiction_list();
			sb.append(story_details(genre));
		}
		return sb.toString();
	}
	/*
	 * story_details(ArrayList<Story> genre) : in this method, we return the story details of the genre
	 */
	String story_details(ArrayList<Story> genre) {
		StringBuilder sb=new StringBuilder();
		Iterator<Story> i=genre.iterator();
		while(i.hasNext()) {
			Story s=(Story)i.next();
			sb.append(s.getName()+" "+s.getAuthor()+" "+String.valueOf(s.getChapters())+String.valueOf(s.getRating()));
			sb.append("\n");
		}
		return sb.toString();
	}
}
