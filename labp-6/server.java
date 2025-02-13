import java.io.*;
import java.net.*;

public class server {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(3333);
        Socket s = ss.accept();
        System.out.println("Client is running on " + s.getPort());
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String str = br.readLine();
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);
        out.println("hello " + str);
    }
}