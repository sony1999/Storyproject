package projectstory;

import java.util.ArrayList;



public class StoryDatabase {
	static ArrayList<Story> fantasy=new ArrayList<>();
	static ArrayList<Story> fiction=new ArrayList<>();
	private static StoryDatabase sd;
	/*
	 * getInstance() : creating a single instance of the object
	 */
	public static StoryDatabase getInstance() {
		if(sd==null) {
			sd=new StoryDatabase();
		}
		return  sd;
	}
	/*
	 * database(): adding values as database.
	 */
	public void database() {
		Fantasy f= new Fantasy( "whatyouwishfor", "winchester", 12,8,123);
		if(f.check_chapters(f.getChapters())== true)  fantasy.add(f);
		Fantasy f1=new Fantasy( "Dragonboy", "EvanLazuli", 14,7,234);
		if(f1.check_chapters(f1.getChapters())== true)  fantasy.add(f1);
		Fantasy f2=new Fantasy("thetraitor'sheir", "winchester", 12,9,345);
		if(f2.check_chapters(f2.getChapters())== true)  fantasy.add(f2);
		 Fiction f6=new  Fiction("thedead", "jamesjoyee" , 25,9,238);
		 if(f6.check_chapters(f6.getChapters())== true)  fiction.add(f6);
		 Fiction f7=new  Fiction("monkeyspaw" , "winchester", 23,8,546);
		 if(f7.check_chapters(f7.getChapters())== true)  fiction.add(f7);
		 Fiction f8=new  Fiction("theveldt","raybradbury", 23,7,234);
		 if(f8.check_chapters(f8.getChapters())== true)  fiction.add(f8);
	}
	/*
	 * fantasy_list() : return the fantasy list 
	 */
	public ArrayList<Story> fantasy_list(){
		return fantasy;
	}
	/*
	 * fiction_list() : return the fiction list  
	 */
	public ArrayList<Story> fiction_list(){
		return fiction;
	}
	/*
	 * add(Story s,String g) : add the new objects to the arraylist based on the given String genre
	 */
	public void add(Story s,String genre) {
		if (genre.equalsIgnoreCase("fiction")) {
			fiction.add(s);
		}
		else if(genre.equalsIgnoreCase("fantasy")) {
			fantasy.add(s);
		}
	}
}
