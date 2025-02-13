import java.io.*;
import java.net.*;

public class client {
    public static void main(String[] args) throws Exception {
        System.out.println("Starting the client");
        Socket s = new Socket("localhost", 3333);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);
        out.println(n);
        BufferedReader brr = new BufferedReader(new InputStreamReader(s.getInputStream()));
        System.out.print(brr.readLine());
    }
}