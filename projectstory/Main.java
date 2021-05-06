package projectstory;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to our STORY READER");
		char ch;
		StoryDatabase sd=StoryDatabase.getInstance();
		sd.database();
		do {
		System.out.println("1. to search the story");
		System.out.println("2. to view the genre to read ");
		System.out.println("3. to write the story");
		System.out.println("4. to know the best story in all the genre");
		System.out.println("5. to know the award wining story among all genres");
		System.out.println("enter the number : ");
		int option=sc.nextInt();
		switch(option) {
		case 1: 
			System.out.println("enter option 1 to serach with title\n 2 to search with author");
			int option1=sc.nextInt();
			System.out.println("enter name:");
			String title=sc.next();
			SearchStory ss=new SearchStory();
			System.out.println(ss.search(option1,title,sd));
			break;
		case 2 : 
			System.out.println("enter the genre u want to view \n 1 fantasy \n 2 fiction");
			int option2=sc.nextInt();
			ViewGenre vg=new ViewGenre();
			System.out.println(vg.genre(option2,sd));
			break;
		case 3: 
			System.out.println("enter the storyname :");
			String title1=sc.next();
			System.out.println("enter the authorname : ");
			String author =sc.next();
			System.out.println("enter the chapters : ");
			int chapter=sc.nextInt();
			System.out.println("enter the rating : ");
			int ra=sc.nextInt();
			System.out.println("enter the views of the story : ");
			int view=sc.nextInt();
			System.out.println("select the genre \n 1.fiction \n 2.fantasy");
			int option3=sc.nextInt();
			WriteStory ws=new WriteStory();
			System.out.println(ws.addstory(option3,title1,author,chapter,ra,view,sd));
			break;
		case 4:
			BestStoryInEachGenre a=new BestStoryInEachGenre();
			System.out.println(a.best_story(sd));
			break;
		case 5:
			BestStoryInAllGenre b=new BestStoryInAllGenre();
			System.out.println(b.award_wining_story(sd));
			break;
		default : System.out.println("entered wrong option");
				break;
		}
		System.out.println("do u want to continue (Y/y): ");
		ch=sc.next().charAt(0);
		}while(ch=='Y' || ch=='y');
	}

}
