package edu.hitsz;

import edu.hitsz.driver.ServerDriver;
import edu.hitsz.driver.ClientDriver;

public class Main {

    public static void main(String[] args) {
        // Start the server in a new thread
        Thread serverThread = new Thread(() -> {
            try {
                ServerDriver.main(args);  // Start the server
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        // Start server in background
        serverThread.start();

        // Start the client in the main thread
        try {
            ClientDriver.main(args);  // Start the client
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
