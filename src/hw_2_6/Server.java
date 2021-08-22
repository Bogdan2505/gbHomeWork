package hw_2_6;


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Server extends Thread{
    private ServerSocket server;
    private Socket socket;
    private final int PORT = 8189;

    private List<ClientHandler> clients;

    public Server() {
        clients = new CopyOnWriteArrayList<>();
      new  Thread(()-> {
           try {
               server = new ServerSocket(PORT);
               System.out.println("Server started!");

               while (true) {
                   socket = server.accept();
                   System.out.println("Client connected");
                   clients.add(new ClientHandler(socket, this));
                   System.out.println((clients.size()));

               }
           } catch (IOException e) {
               e.printStackTrace();
           } finally {
               try {
                   server.close();
               } catch (IOException e) {
                   e.printStackTrace();
               }
           }
       }).start();
    }

    public void broadcastMsg(String msg){
        for (ClientHandler c : clients) {
            c.sendMsg(msg);
        }

    }
}