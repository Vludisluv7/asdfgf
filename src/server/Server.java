package server;

public interface Server {
    boolean connectUser(ClientGUI clientGUI);

    String getLog();

    void disconnectUser(ClientGUI clientGUI);

    void message(String text);

    void answerAll(String text);

    void saveInLog(String text);

    String readLog();
}
