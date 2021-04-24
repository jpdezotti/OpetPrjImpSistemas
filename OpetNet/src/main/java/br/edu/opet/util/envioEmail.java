package br.edu.opet.util;

import java.io.UnsupportedEncodingException;
import java.security.Provider;
import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

public class envioEmail {
	
	public void envioSimples(String nomeRemetente, String assunto, String mensagem, String destinatario) throws MessagingException  {
	  
	        String host = "smtp.gmail.com";
	        String usuario = "jpdezotti@gmail.com";
	        String senha = "GoogleAcc0unt";
	        String remetente = "jpdezotti@gmail.com"; //Pode trocar aqui pela String usuario
	        
	        Properties adress = new Properties();

	        Properties props = System.getProperties();
	        props.put("mail.smtp.starttls.enable", "true");
	        props.put("mail.smtp.host", host);
	        props.put("mail.smtp.port", "587");
	        props.put("mail.smtp.auth", "true");
	        props.put("mail.smtp.starttls.required", "true");
	        props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
	        /*
	        Session session = Session.getInstance(adress);
	        MimeMessage msg = new MimeMessage(session);
	        t
	        Store store = session.getStore("smtp");
	        store.connect(host, usuario, senha);
	        
	        
	       
	      */
	  
	}

}