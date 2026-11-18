import java.io.*;
import java.net.*;
import java.util.*;
public class SimpleClient{
    private Socket socket;
    private PrintWriter out;
    private Scanner in;
    public SimpleClient(String ip, int port){
       socket = new Socket(ip, port);

    }
    public void sendMessage(String message){

    }
    public String recieveMessage(){
        return "";
    }
    public void close(){

    }
    public void main(String[] args){
        try{
        SimpleClient client = new SimpleClient("localhost",1234); 
        out = new PrintWriter(client.getOutputStream());
        in = new Scanner(client.getInputStream());
        } catch(Exception e){
            System.out.println(e);
        }
    }
}