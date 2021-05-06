package projectstory;

import java.util.ArrayList;
import java.util.Iterator;

public class BestStoryInEachGenre {
	/*
	 * best_story() : in this method, we return the highest rating stories of each genre.
	 */
	public String best_story(StoryDatabase sd) {
		StringBuilder sb=new StringBuilder();
		sb.append("the best story in fantasy according to rating: \n");
		sb.append(best_rating(sd.fantasy_list())+" \n ");
		sb.append("the best story in fiction according to rating: \n");
		sb.append(best_rating(sd.fiction_list())+"\n");
		return sb.toString();
	}
	/*
	 * best_rating() : in this method, we return the best story in that particular genre.
	 */
	public String best_rating(ArrayList<Story> genre) {
		int rating=0;
		StringBuilder st=new StringBuilder();
		Iterator<Story> i= genre.iterator();
		while(i.hasNext()) {
			Story s= (Story)i.next();
			rating = Math.max(rating, s.getRating());
		}
		Iterator<Story> j= genre.iterator();
		while(j.hasNext()) {
			Story s1=(Story)j.next();
			if(s1.getRating() == rating) {
				st.append("Story name : "+s1.getName()+"\n");
				st.append("author name : "+s1.getAuthor()+"\n");
				st.append("Chapters in the story : "+String.valueOf(s1.getChapters())+"\n");
				st.append("the rating of the story : "+String.valueOf(s1.getRating())+"\n");
				st.append("the views in the story : "+String.valueOf(s1.getViews())+"\n");
			}
		}
		return st.toString();
	}
}
