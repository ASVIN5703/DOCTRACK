package com.doctrackapp.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

import com.doctrackapp.webapp.controller.SimpleBot;

@SpringBootApplication
public class DoctrackAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoctrackAppApplication.class, args);
		 try {
	            TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
	            botsApi.registerBot(new SimpleBot());
	        } catch (TelegramApiException e) {
	            e.printStackTrace();
	        }
	}

}
