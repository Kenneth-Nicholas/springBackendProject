package lab.controller;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;

public class SendSms {
 // Find your Account Sid and Token at twilio.com/console
 // DANGER! This is insecure. See http://twil.io/secure
 public static final String ACCOUNT_SID = "";
 public static final String AUTH_TOKEN = "";

   public static void sendSms(String phoneNumber) { 
	  
	  String messageForText = "Thank you for registering for Arch Arrivals!";
	  
      Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
      
      Message message = Message.creator(
             new com.twilio.type.PhoneNumber(phoneNumber),
             new com.twilio.type.PhoneNumber("+13142261128"),
             messageForText)
         .create();

     System.out.println(message.getSid());
     
   }
   
}
