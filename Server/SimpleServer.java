import java.io.*;
import java.net.*;
import java.util.*;
public class SimpleServer{
    private ServerSocket serverSocket;
    private Socket socket;
    private PrintWriter out;
    private Scanner in;

    public SimpleServer(int port) throws Exception{
        serverSocket = new ServerSocket(port);
        
        
        
    }
    public void acceptClient() throws Exception{
        socket = serverSocket.accept();
        in = new Scanner(socket.getInputStream());
        out = new PrintWriter(socket.getOutputStream(), autoFlush:true);
    }
    public String recieveMessage(){
        return in.nextLine();
    }
    public void sendMessage(String message){
        out.println(message);
        out.flush();
    }
    public void close() throws Exception{
        in.close();
        out.close();
        socket.close();
        serverSocket.close();
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        try{
            SimpleServer server = new SimpleServer(9090);
            server.acceptClient();
            while(true){
                String message = input.nextLine();
                server.sendMessage(message);
                String response = server.recieveMessage();
                System.out.println("Client: "+response);
                if(response.equals(anObject:"stop")){
                    break;
                }
            }
            server.close();



        } catch(Exception e){
            System.out.println(e);
        }
    }

}