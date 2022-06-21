package vttp2022.day6.workshop.server;


public class ServerApp 
{
    public static void main(String[] args )
    {
        System.out.println( "Server App" );

        int port 3001;
        if(ars.length > 0)
          port = Integer.parseInt(args[0]);

        String cookieFile = args[1];

        ExecutorService threadPool = Executors.newFixedThreadPool(2);

        ServerSocket server = new ServerSocket(port);

        while(true){
            System.out.println("Waiting for client connection");
            Socket socket = server.accept();
            System.out.println("Connected.....");
            CookieClientHandler thr = new CookieClientHandler(socket, cookiefile);
            threadPool.submit(thr);
            System.out.println("Submitted to threadpool");


        }
        }

    }

