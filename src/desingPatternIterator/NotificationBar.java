package desingPatternIterator;


public class NotificationBar {

	private Collection notifications; 
    
    private NotificationCollection notification;

    /**
     * Constructor
     * 
     * @param notification 
     */
    public NotificationBar(NotificationCollection notification) {
        this.notification = notification;
    }

    /**
     * Prints all notifications contained in the NotificationCollection
     */
    public void printNotifications() {
        Iterator iterator = notification.createIterator(); 
        System.out.println("--------------Notification Bar -----------");
        while (iterator.hasNext()) { 
            Notification n = (Notification) iterator.next(); 
            System.out.println(n.getNotification()); 
        }
    }

    /**
     * Adds a new notification to the NotificationCollection.
     * 
     * @param str 
     */
    public void addItem(String str) {
        notification.addItem(str); 
    }
}