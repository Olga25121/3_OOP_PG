package Seminars.OOPLesson_7.workshop;

//Создайте интерфейс Message, который определяет методы для отправки и получения текстового сообщения.
/**
 * Message
 */
public interface Message {

    void sendMessage(String text);
    void getMessage();
}