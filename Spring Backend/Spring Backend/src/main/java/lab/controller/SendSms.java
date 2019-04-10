package lab.controller;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;

public class SendSms {
 // Find your Account Sid and Token at twilio.com/console
 // DANGER! This is insecure. See http://twil.io/secure
 public static final String ACCOUNT_SID = "ACf3478307ed7f3231c60ab47db8bbefd9";
 public static final String AUTH_TOKEN = "5dbd888b281237cab9b3df8f64e8e084";

   public static void sendSms(String phoneNumber) { 
	  
	  String messageForText = "Thank you for registering for Arch Arrivals!";
	  
      Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
      
      Message message = Message.creator(
             new com.twilio.type.PhoneNumber(phoneNumber),
             new com.twilio.type.PhoneNumber("+15012145809"),
             messageForText)
         .create();

     System.out.println(message.getSid());
     
   }
   
}
