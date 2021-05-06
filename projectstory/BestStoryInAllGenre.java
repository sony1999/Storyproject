package projectstory;

import java.util.ArrayList;
import java.util.Iterator;

public class BestStoryInAllGenre {
	/*
	 * award_wining_story() :  in this method we get the highest views of each genre and
	 * 							take it in story array and compare them and return the highest views story 
	 */
	public String award_wining_story(StoryDatabase sd) {
		int view=0;
		StringBuilder sb=new StringBuilder();
		Story s1[]=new Story[2];
		ArrayList<Story> fantasy=sd.fantasy_list();
		Iterator<Story> i =fantasy.iterator();
		while(i.hasNext()) {
			Story s=(Story)i.next();
			if(view < s.getViews()) {
				view=s.getViews();
				s1[0]=s;
			}
		}
		ArrayList<Story> fiction=sd.fiction_list();
		Iterator<Story> j =fiction.iterator();
		while(j.hasNext()) {
			Story s2=(Story)j.next();
			if(view < s2.getViews()) { view=s2.getViews(); s1[1]=s2;}
		}
		for(int k=0;k<2;k++) {
			if(view == s1[k].getViews()) {
				sb.append("story name : "+s1[k].getName()+"\n");
				sb.append("the author name : "+s1[k].getAuthor()+"\n");
				sb.append("chapters in the story : "+s1[k].getChapters()+"\n");
				sb.append("Rating of story : "+s1[k].getRating()+"\n");
				sb.append("the views of story  : "+s1[k].getViews());
			}
		}
		return sb.toString();
	}
}
