package projectstory;

import java.util.ArrayList;
import java.util.Iterator;

public class WriteStory {
	/*
	 *  addstory(): in this method, we create a object for the new story and add it in storydatabase class
	 *  			depending on the option.
	 *  			we print the details of the genre after adding the new story.
	 */
	public String addstory(int option3,String title1,String author,int chapter,int rating,int view,StoryDatabase sd) {
		StringBuilder sb=new StringBuilder();
		ArrayList<Story> genre=new ArrayList<>();
		if(option3==1) {
			Fiction f=new Fiction(title1,author,chapter,rating,view);
			if(f.check_chapters(chapter)==true) {
			sd.add(f, "fiction");
			}
			else {
				sb.append("entered wrong no of chapters for ficiton");
			}
			sb.append("the list of stories in fiction genre is  : \n");
			genre=sd.fiction_list();
			Iterator<Story> i= genre.iterator();
			while(i.hasNext()) {
				Story s= (Story)i.next();
				sb.append(s.getName()+" "+s.getAuthor()+" "+String.valueOf(s.getChapters())+" "+String.valueOf(s.getRating())+"\n");
			}
		}
		else {
			Fantasy f=new Fantasy(title1,author,chapter,rating,view);
			if(f.check_chapters(chapter)==true) {
			sd.add(f, "fantasy");
			}
			else {
				sb.append("entered wrong no of chapters for ficiton");
			}
			sb.append("the list of stories in fantasy genre is  : \n");
			genre=sd.fantasy_list();
			Iterator<Story> i= genre.iterator();
			while(i.hasNext()) {
				Story s= (Story)i.next();
				sb.append(s.getName()+" "+s.getAuthor()+" "+String.valueOf(s.getChapters())+" "+String.valueOf(s.getRating())+"\n");
			}
		}
		return sb.toString();
	}
}
