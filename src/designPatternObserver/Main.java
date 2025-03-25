package designPatternObserver;
 
public class Main {
 
	public static void main(String[] args) {
		NewsAgency observable = new NewsAgency();
		Channel observer = new NewsChannel();
		
		observable.addObserver(observer);
		observable.setNews("Test");
		System.out.println(observable.getNews() + " = " + observer.getNews());
		
		NewsAgencyJava observableJava = new NewsAgencyJava();
		NewsChannelJava observableJava1 = new NewsChannelJava();
		observableJava.addObserver(observerJava);
		observableJava.setNews("Test");
	}
}
 