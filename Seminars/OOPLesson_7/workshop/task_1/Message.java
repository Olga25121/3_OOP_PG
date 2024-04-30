package Seminars.OOPLesson_7.workshop.task_1;

//Создайте интерфейс Message, который определяет методы для отправки и получения текстового сообщения.
/**
 * Message
 */
public interface Message {

    void sendMessage(String text);
    void getMessage();
    static String getText() {
        return null;
    }
}