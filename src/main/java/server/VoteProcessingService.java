import java.net.Socket;

public class VoteProcessingService implements Runnable {
    private Socket clientSocket;
    
    public VoteProcessingService(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }
    
    @Override
    public void run() {
        // Handle the client connection and voting logic
    }
}
