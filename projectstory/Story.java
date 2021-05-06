package projectstory;

public class Story implements IStory {
	private String name;
	private String author;
	private int chapters;
	private int rating;
	private int views;
	Story(String name,String author,int chapters,int rating,int views){
		this.name=name;
		this.author=author;
		this.chapters=chapters;
		this.setRating(rating);
		this.views=views;
	}
	/*
	 * getName(): returns the story name
	 */
	public String getName() {
		return name;
	}
	/*
	 * setName() : set the story name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/*
	 *  getAuthor() : returns the author name
	 */
	public String getAuthor() {
		return author;
	}
	/*
	 * setAuthor() : set the author name.
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	/*
	 * getChapters() : return the number of chapters of a story 
	 */
	public int getChapters() {
		return chapters;
	}
	/*
	 * setChapters() : set the number of chapters of a story
	 */
	public void setChapters(int chapters) {
		this.chapters = chapters;
	}
	/*
	 * getRating() : return the rating of the story.
	 */
	public int getRating() {
		return rating;
	}
	/*
	 * setRating() :  set the rating of the story.
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}
	/*
	 * getViews() : return the views of the story.
	 */
	public int getViews() {
		return views;
	}
	/*
	 * setViews() : set the views of the story.
	 */
	public void setViews(int views) {
		this.views = views;
	}
	
}
