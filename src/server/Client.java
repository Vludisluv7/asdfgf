package server;

public interface Client {
    void connectToServer();

    void disconnectFromServer();

    void message();
}
