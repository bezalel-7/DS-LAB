import java.io.*;
import java.net.*;

public class server1 {
    public static void main(String[] args) throws Exception {
        System.out.println("wating for clients");
        ServerSocket ss = new ServerSocket(3333);
        Socket s = ss.accept();
        System.out.println("connection eastablished");
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String str = br.readLine();
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);
        out.println("The server says" + str);
    }
}