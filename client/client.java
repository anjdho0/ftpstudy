import java.net.Socket;
import java.net.ServerSocket;
import java.io.IOException;


public class FTPClient{

    int port;
    String ipAddress;
    Socket clientSocket;

    public static void main(String[] args){

        FTPClient client = new FTPClient("127.0.0.1", 21);
        client.run();
    }

    public FTPClient(Strirng ipaddress, int portnum){
        
        ipAddress = ipaddress;
        port = portnum;
        clientSocket = new Socket(ipAddress, port);

    }


    void run(){

    }

}