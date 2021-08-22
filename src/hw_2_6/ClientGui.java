package hw_2_6;

import java.io.IOException;
import java.util.Scanner;

public class ClientGui {


    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String str;
        Client client = new Client("localhost", 8189);

        do{
            str = scanner.nextLine();
            client.sendMsg(str);
        }while(!str.equals("/close"));
    }



}

