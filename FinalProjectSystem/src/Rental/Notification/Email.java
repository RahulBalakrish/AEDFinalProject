/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 package Rental.Notification;
 
import java.util.Date;
import javax.mail.PasswordAuthentication;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;

/**
 *
 * @author rahulb
 */
public  class Email {
    
    
    public void sendMail(String msg,String item,String cid, String pid, String rid,  String fee, String rentd, String returnd, String email) throws Exception{
     Properties properties = new Properties();
     properties.put("mail.smtp.auth", "true");
     properties.put("mail.smtp.starttls.enable", "true");
     properties.put("mail.smtp.host", "smtp.gmail.com");
     properties.put("mail.smtp.port", "587");
     properties.put("mail.transport.protocol", "smtp");
     
     Session session = Session.getInstance(properties, new Authenticator(){
         @Override
         protected PasswordAuthentication getPasswordAuthentication(){
             return new PasswordAuthentication("hokagelelouch@gmail.com", "ddreokaexpxocjwt");
         }         
     });
     MimeBodyPart textBodyPart = new MimeBodyPart();
        textBodyPart.setText("Rental Management" + "\n\n" + "------------------------------" + "\n" + "Customer ID :" + cid + "\n" + "Product ID: " + pid + "\n" + "Return Date : " + returnd + "\n" + "Rent Date : " + rentd + "\n" + "Message :" + msg + "\n\n" + "------------------------------" + "\n", "UTF-8");
        Message message = new MimeMessage(session);
        message.setSubject(item + "LeaseLyfe Rental Services");
        Address toAddress = new InternetAddress(email);
        message.setRecipient(Message.RecipientType.TO, toAddress);
        
        MimeBodyPart imageBodyPart = new MimeBodyPart();
        DataSource fds = new FileDataSource("src//Images//MailLogo.jpeg");  // Replace with the actual path to your image
        imageBodyPart.setDataHandler(new DataHandler(fds));
        imageBodyPart.setHeader("Content-ID", "<image>");

        // Combine text and image into a multipart
        MimeMultipart multipart = new MimeMultipart();
        multipart.addBodyPart(textBodyPart);
        multipart.addBodyPart(imageBodyPart);

        
        message.setContent(multipart);

        
        Transport.send(message);
//     Message message = new MimeMessage(session);
//     message.setSubject( item + " Rental Service");
//     
//     
//     Address toAddress = new InternetAddress(email);
//     message.setRecipient(Message.RecipientType.TO, toAddress);
//     
//     MimeMultipart multipart = new MimeMultipart();   
//     
//     MimeBodyPart messageBody = new MimeBodyPart();
//     
//     messageBody.setContent("Rental Management" + "\n\n" + "------------------------------" + "\n" + "Customer ID :" + cid + "\n" + "Product ID: " + pid+ "\n" + "Return Date : " + returnd + "\n" + "Rent Date : " + rentd + "\n" + "Message :" + msg + "\n\n" + "------------------------------" + "\n" , "text/plain");
//
//     multipart.addBodyPart(messageBody);
//     message.setContent(multipart);
//     Transport.send(message);         
    }

}

