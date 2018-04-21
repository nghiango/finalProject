package ch.ubitec.chatbotslack.controllers;

import ch.ubitec.chatbotslack.repositories.SlackBotRepository;
import me.ramswaroop.jbot.core.common.Controller;
import me.ramswaroop.jbot.core.common.EventType;
import me.ramswaroop.jbot.core.slack.Bot;

import me.ramswaroop.jbot.core.slack.models.Event;
import me.ramswaroop.jbot.core.slack.models.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.WebSocketSession;

import java.util.regex.Matcher;
@Component
public class SlackBotController extends Bot {

    @Autowired
    SlackBotRepository slackBotRepository;

    @Value("${slackBotToken}")
    private String slackToken;

    @Override
    public String getSlackToken() {
        return slackToken;
    }

    @Override
    public Bot getSlackBot() {
        return this;
    }

    @Controller(events = {EventType.DIRECT_MENTION, EventType.DIRECT_MESSAGE})
    public void onReceiveDM(WebSocketSession session, Event event) {
        reply(session, event, new Message("Hi, I am " + slackService.getCurrentUser().getName()));
    }

    @Controller(events = EventType.MESSAGE, pattern = "hello|hi|hey")
    public void onReceiveMessageWhenUserSayHi(WebSocketSession session, Event event, Matcher matcher) {
        String userID = event.getUserId();
        reply(session, event, new Message("Hello! Nice to meet you "));
    }
}
