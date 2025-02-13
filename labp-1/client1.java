import java.io.*;
import java.net.*;

public class client1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Client started");
        Socket s = new Socket("localhost", 3333);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);
        out.println(str);
        BufferedReader brr = new BufferedReader(new InputStreamReader(s.getInputStream()));
        System.out.println(brr.readLine());

    }
}