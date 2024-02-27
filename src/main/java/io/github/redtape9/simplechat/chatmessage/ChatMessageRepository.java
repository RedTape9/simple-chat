package io.github.redtape9.simplechat.chatmessage;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ChatMessageRepository extends MongoRepository<ChatMessage, String> {
    List<ChatMessage> findAllByChatId(String chatId);

}
