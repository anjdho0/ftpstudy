import java.net.Socket;
import java.net.ServerSocket;
import java.io.IOException;



public class FTPServer{

    public static void main(String[] args){

        FTPServer server = new FTPServer();
        server.run();


    }

    int port = 20;
    ServerSocket serverSocket = new ServerSocket(port);

    void run(){
        while(true){
            serverSocket.accept();
            if(System.in.read() == '0'){
                break;
            }    

        }


    } 


}
