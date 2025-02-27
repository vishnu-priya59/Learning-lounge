package SOLID.SRP;

public class NotificationService {

    public void sendOTP(String medium){
        if(medium.equals("Email")){
            //Use JavaMailSender API
            //Write some logic
        }
        if(medium.equals("Mobile")){
            //use twillio API
        }
    }
}
