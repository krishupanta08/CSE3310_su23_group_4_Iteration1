package uta.cse.cse3310.webchat;

import java.io.IOException;

import net.freeutils.httpserver.HTTPServer;


/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws IOException {
        int port = 8080;
        HttpServer H = new HttpServer(port, "./html");
        H.start();

        System.out.println("HTTP Server started on port " + port);
    }


}
