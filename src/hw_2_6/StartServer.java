package hw_2_6;

import java.util.Scanner;

public class StartServer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Server server = new Server();
        String str;

        while (true){
            str = scanner.nextLine();
            server.broadcastMsg(str);
        }
    }
}
