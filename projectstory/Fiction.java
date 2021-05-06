package projectstory;

public class Fiction extends Story implements IGenre{

	/*
	 * Fiction() : this class extends story class and  inherits all the values
	 */
	Fiction(String name, String author, int chapters,int rating,int views) {
		super(name,author,chapters,rating,views);
	}
	/*
	* check_chapters(): checks the no of chapters in the fiction are greater than 20 and less than 30
	*/
	public boolean check_chapters(int chapter) {
		if(chapter<30 && chapter >20) {
			return true;
		}
		return false;
	}

}
