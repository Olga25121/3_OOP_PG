package Seminars.OOPLesson_7.workshop;

//Напишите клиентский код, который будет использовать декоратор для отправки и получения 
//текстовых сообщений с дополнительной информацией.

public class Main {
    public static void main(String[] args) {
        System.out.println();
        TextMessage textMessage = new TextMessage("Hello, world!");
        MessageDecorator messageDecorator = new MessageDecorator(textMessage);
        messageDecorator.getMessage();
        System.out.println();
    

    }
}
