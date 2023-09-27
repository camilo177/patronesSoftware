//1.Implement interface Product --> notification in this case
interface Notification{ //Interface defines atributes and methods
    void sendMessage(String message);
}

//2.Implement concrete classes (Concrete Products)
class EmailNotification implements Notification{
    @Override
    public void sendMessage(String message){
        System.out.println("Sending email: " + message);
    }
}

class SMSNotification implements Notification{
    @Override
    public void sendMessage(String message){
        System.out.println("Sending SMS: " + message);
    }
}

//3.Define the abstract Class
abstract class NotificationCreator{
    public abstract Notification createNotification();
}

//4. Implements concrete subclasses of "NotificationCreator"
class EmailCreator extends NotificationCreator{
    @Override
    public Notification createNotification(){
        return new EmailNotification();
    }
}

class SMSCreator extends NotificationCreator{
    @Override
    public Notification createNotification(){
        return new SMSNotification();
    }
}

public class Main {
    public static void main(String[] args) {
        //Client decides which type of notification to use
        NotificationCreator creator = new EmailCreator();

        //The app creates a notifications without knowing the concrete class
        Notification notification = creator.createNotification();

        //The client uses the notification
        notification.sendMessage("Hello mate");


        //Client decides which type of notification to use
        NotificationCreator creatorTwo = new SMSCreator();

        //The app creates a notifications without knowing the concrete class
        Notification notificationTwo = creatorTwo.createNotification();

        //The client uses the notification
        notificationTwo.sendMessage("Hello from SMS");
    }
}
