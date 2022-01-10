package learn.Network;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class DailyAdviceServer {
    String[] adviceList={"aaa","bbb","ccc","dddd"};
    public void go(){
        try {
            ServerSocket serverSocket = new ServerSocket(4242);
            while (true){
                Socket sock = serverSocket.accept();
                PrintWriter writer = new PrintWriter(sock.getOutputStream());
                String advice=getAdvice();
                writer.println(advice);
                writer.close();
                System.out.println(advice);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private String getAdvice(){
        int random=(int) (Math.random()*adviceList.length);
        return adviceList[random];
    }

}
