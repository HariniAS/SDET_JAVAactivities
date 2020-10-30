package JavaActivity2_1_AbstractClass;

abstract class book {
	String title;
	abstract void setTitle(String s);
	public String getTitle() {
		return title;
	}
}

class myBook extends book{
	public void setTitle (String s) {
		title = s;
	}
}

public class Activity2_1_absClass {

	public static void main(String[] args) {
		myBook newNovel = new myBook();
		newNovel.setTitle("Harry Potter");
		System.out.println(newNovel.getTitle());
	}

}
