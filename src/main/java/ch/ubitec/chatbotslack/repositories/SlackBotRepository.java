package ch.ubitec.chatbotslack.repositories;

import ch.ubitec.chatbotslack.models.SlackBot;
import org.springframework.data.repository.CrudRepository;

public interface SlackBotRepository extends CrudRepository<SlackBot, Integer> {
    Integer countByUser(String userId);
}
