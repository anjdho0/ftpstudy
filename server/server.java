import java.net.Socket;
import java.net.ServerSocket;
import java.io.IOException;



public class FTPServer{

    int port;
    ServerSocket serverSocket;

    public static void main(String[] args){

        FTPServer server = new FTPServer(20);
        server.run();


    }

    public FTPServer(int portnum){
        port = portnum;
        serverSocket = new ServerSocket(port);
    }



    void run(){
        while(true){
            serverSocket.accept();
            if(System.in.read() == '0'){
                break;
            }    

        }


    } 


}
