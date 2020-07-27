package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Message {
    private Integer messageID;
    private String message;
    private String author;
    private Date messageDate;
    SimpleDateFormat format = new SimpleDateFormat("dd/MM/YYYY");

    Message(String message, String author, Date messageDate){
        this.message = message;
        this.author = author;
        this.messageDate = messageDate;
        /*try{
            this.messageDate = format.parse(messageDate);
        }catch(ParseException e){
            e.printStackTrace();
        }*/
    }

    public Integer getMessageID() {
        return messageID;
    }

    public void setMessageID(Integer messageID) {
        this.messageID = messageID;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getMessageDate() {
        return messageDate;
    }

    public String getMessageDate(String DATE) {
        return format.format(messageDate);
    }

    public void setMessageDate(Date messageDate) {
            this.messageDate = messageDate;
    }
}
