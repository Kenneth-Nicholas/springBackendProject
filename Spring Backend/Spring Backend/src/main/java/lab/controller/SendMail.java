package lab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class SendMail {
@Autowired
private JavaMailSender emailSender;

public void sendMail(String toEmail, String subject, String msg) {
SimpleMailMessage message = new SimpleMailMessage();
message.setTo(toEmail);
message.setSubject(subject);
message.setText(msg);


emailSender.send(message);
}
}