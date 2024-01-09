package src.main.java.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class VoteServer {
    private static final int PORT = 1234;

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Vote Server started, listening on port " + PORT);

            while (true) {
                Socket clientSocket = serverSocket.accept();
                new Thread(new VoteProcessingService(clientSocket)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static class VoteProcessingService implements Runnable {
        private Socket clientSocket;

        public VoteProcessingService(Socket clientSocket) {
            this.clientSocket = clientSocket;
        }

        @Override
        public void run() {
            System.out.println("Connected to client " + clientSocket.getRemoteSocketAddress());

    
           }
    }

}
