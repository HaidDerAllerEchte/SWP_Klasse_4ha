package designPatternObserver;
 
import java.util.Observable;
import java.util.Observer;
 
public class NewsChannelJava implements Observer{
	
	private String news;
	
	public String getNews() {
		return this.news;
	}
	
	public void setNews(String news) {
		this.news = news;
	}
	
	public void update(Observer o, Object arg) {
		this.news = (String) arg;
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}
}