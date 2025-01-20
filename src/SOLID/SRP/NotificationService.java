package SOLID.SRP;

public class NotificationService {

    public void sendOTP(String medium){
        if(medium.equals("Email")){
            //Use Javamailsender API
            //Write some logic
        }
        if(medium.equals("Mobile")){
            //use twillio API
        }
    }
}
