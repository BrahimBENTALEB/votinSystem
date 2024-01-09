package src.main.java.client;



import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class VoterClient {
    private Socket socket;
    private String serverAddress;
    private int serverPort;

    public VoterClient(String serverAddress, int serverPort) {
        this.serverAddress = serverAddress;
        this.serverPort = serverPort;
    }

    public void connectToServer() throws UnknownHostException, IOException {
        socket = new Socket(serverAddress, serverPort);
        // Set up input/output streams with the socket
    }

    public void sendVote(String vote) { 
        // Send the vote to the server

        





    }

    // Include methods for communication and closing the connection
}
