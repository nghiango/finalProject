package ch.ubitec.chatbotslack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"me.ramswaroop.jbot", "ch.ubitec"})
public class ChatBotSlackApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChatBotSlackApplication.class, args);
	}
}
