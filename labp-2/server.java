import java.io.*;
import java.net.*;

public class server {
    public static void main(String[] args) throws Exception {
        System.out.println("Wating for client!!!");
        ServerSocket ss = new ServerSocket(3333);
        Socket s = ss.accept();
        System.out.println("processing the request of factorial!!!");
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        int n = Integer.parseInt(br.readLine());
        int fact = 1;
        for (int i = n; i > 0; i--) {
            fact *= i;
        }
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);
        out.println("The fact of " + n + " is " + fact);
    }
}