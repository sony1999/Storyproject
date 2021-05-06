package projectstory;

import java.util.ArrayList;
import java.util.Iterator;

public class SearchStory {
	/*
	 * search() : in this method, we return the story details based on the given title/author to search
	 */
	public String search(int option,String title,StoryDatabase sd) {
		StringBuilder sb=new StringBuilder();
		ArrayList<Story> fantasy=sd.fantasy_list();
		ArrayList<Story> fiction=sd.fiction_list();
		if(option==1) {
			sb.append(title_details(fantasy,title));
			sb.append(title_details(fiction,title));
		}
		else {
			sb.append(author_details(fantasy,title));
			sb.append(author_details(fiction,title));
		}
		return sb.toString();
	}
	/*
	 * title_details(): in this method, we search for the title in particular genre
	 */
	public String title_details(ArrayList<Story> genre,String title) {
		StringBuilder sb=new StringBuilder();
		Iterator<Story> i= genre.iterator();
		while(i.hasNext()) {
			Story s= (Story)i.next();
			if(s.getName().equalsIgnoreCase(title)) {
				sb.append(s.getName()+" "+s.getAuthor()+" "+String.valueOf(s.getChapters())+" "+String.valueOf(s.getRating())+"\n");
			}
		}
		return  sb.toString();
	}
	/*
	 * author_details() : in this method, we search for the author in particular genre.
	 */
	public String author_details(ArrayList<Story> genre,String author) {
		StringBuilder sb=new StringBuilder();
		Iterator<Story> i= genre.iterator();
		while(i.hasNext()) {
			Story s= (Story)i.next();
			if(s.getAuthor().equalsIgnoreCase(author)) {
				sb.append(s.getName()+" "+s.getAuthor()+" "+String.valueOf(s.getChapters())+" "+String.valueOf(s.getRating())+"\n");
			}
		}
		return  sb.toString();
	}
}
