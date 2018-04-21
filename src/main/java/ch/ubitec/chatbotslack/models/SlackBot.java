package ch.ubitec.chatbotslack.models;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class SlackBot {
    @Id
    private String id;
    private String user;
    private String word;
    private Date updateDate = new Date();

    public SlackBot(String user, String word) {
        this.user = user;
        this.word = word;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
