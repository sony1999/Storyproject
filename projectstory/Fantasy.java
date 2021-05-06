package projectstory;

public class Fantasy extends Story implements IGenre{

	/*
	 * Fantasy() : this class extends story class and  inherits all the values
	 */
	Fantasy(String name, String author, int chapters,int rating,int views) {
		super(name, author, chapters,rating,views);
	}
	public boolean check_chapters(int chapter) {
		if(chapter<20) {
			return true;
		}
		return false;
	}
}
