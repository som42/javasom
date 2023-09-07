package ch09nested.book.sec07.exam01.p07;

import ch07extends.book.sec06.package2.C;

public class Chatting {
    class Chat {
        void start(){}
        void sendMessage(String message){

        }

    }

    void startChat(String chatId){
        String nickName = chatId;

        Chat chat = new Chat(){
            @Override
            void start(){
                while (true){
                    String inputData = "안녕하세요";
                    String message = "[" + nickName + "]" + inputData;
                    sendMessage(message);
                }
            }
        };

        chat.start();
    }
}
