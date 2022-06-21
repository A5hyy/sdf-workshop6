package vttp2022.day6.workshop.server;

import java.io.IOException;
import java.net.Socket;

public class CookieClientHandler implements Runnable {

    private Socket socket;
    public CookieClientHandler(Socket s){
        this.socket = s;
    }

    @Override
    public void run(){
        System.out.println("Starting a client thread");
        try{
            NetworkIO netIO = new NetworkIO(socket);
            String req = "";
            while(!req.equals("exit")){
                req = netIO.read();
                System.out.printf("[CLIENT] %s/n", req);
                if(req.trim().equals("exit"))
                  break;
                // TODO implement the random cookie then return the string 2
                // client

                  netIO.write("");
           }

           netIO.close();
           socket.close();
           System.out.println("Exiting the thread!");

        } catch (IOException e){
            e.printStackTrace();
        }
        

            
           
        
    }
    
}
