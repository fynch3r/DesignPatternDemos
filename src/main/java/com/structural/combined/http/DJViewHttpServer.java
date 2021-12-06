package com.structural.combined.http;

import com.structural.combined.model.BeatModel;
import com.sun.net.httpserver.HttpServer;

import java.net.InetSocketAddress;

/**
 * @program: DesignPattern
 * @description:
 * @author: 0range
 * @create: 2021-12-02 19:23
 **/


public class DJViewHttpServer {
    public static void main(String[] args) {
        try{
            System.out.println("DJView Http Server Running");

            BeatModel beatModel = new BeatModel();
            beatModel.initialize();

            HttpServer server = HttpServer.create(new InetSocketAddress("localhost", 8099), 0);
            server.createContext("/combined", new DJViewHttpHandler(beatModel));
            server.start();
            System.out.println("DJView Server is running at http://localhost:8099/combined");


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
