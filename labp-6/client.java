import java.io.*;
import java.net.*;

public class client {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 3333);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name:-");
        String str = br.readLine();
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);
        out.println(str);
        System.out.println("********************");
        System.out.println("The local port of the client " + s.getLocalPort());
        System.out.println("The remote port of the client " + s.getPort());
        System.out.println("The local socket is " + s);
    }
}