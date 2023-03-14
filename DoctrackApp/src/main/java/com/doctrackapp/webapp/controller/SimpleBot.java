package com.doctrackapp.webapp.controller;


import org.springframework.stereotype.Controller;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
@Controller
public class SimpleBot extends TelegramLongPollingBot{
	@Override
	public void onUpdateReceived(Update update) {
	        // TODO
		 System.out.println(update.getMessage().getText());
		 /*
		 System.out.println(update.getMessage().getFrom().getFirstName());
		 SendMessage message = new SendMessage(); // Create a SendMessage object with mandatory fields
	        message.setChatId(update.getMessage().getChatId().toString());
	        message.setText(update.getMessage().getText());*/
		 String cmd=update.getMessage().getText();
		 
		 if(cmd.equals("/view")) {
			
			 String message="Hi I am your personal bot how may i help You";
			 SendMessage res = new SendMessage(); // Create a SendMessage object with mandatory fields
		        res.setChatId(update.getMessage().getChatId().toString());
		        res.setText(message);
		        try {
		        	execute(res);
		        }
		        catch(Exception e) {
		        	
		        }
		 }
		 if(cmd.equals("/details")) {
			 String message="Doc:Asvin near sathy"; 
			 SendMessage res = new SendMessage(); // Create a SendMessage object with mandatory fields
		        res.setChatId(update.getMessage().getChatId().toString());
		        res.setText(message);
		        try {
		        	execute(res);
		        }
		        catch(Exception e) {
		        	
		        }
		 }
		 
	    }

	    @Override
	    public String getBotUsername() {
	        // TODO
	        return "Doctrack";
	    }

	    @Override
	    public String getBotToken() {
	        // TODO
	        return "6079109062:AAEgpG6X1jkpoGXgKqeuS6_3MO1fLBZT_a0";
	    }

		
}
