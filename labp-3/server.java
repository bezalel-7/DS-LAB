import java.io.*;
import java.net.*;
import java.util.Arrays;

public class server {
    public static void main(String[] args) throws Exception {
        System.out.println("Waitng of the clients");
        ServerSocket ss = new ServerSocket(3333);
        Socket s = ss.accept();
        byte b[] = new byte[2222];
        System.out.println("Connection established, ech paddu");
        FileInputStream fr = new FileInputStream("/Users/varadudi/Desktop/DS-LAB/labp-3/input.txt");
        fr.read(b, 0, b.length);
        OutputStream os = s.getOutputStream();
        os.write(b, 0, b.length);
        System.out.println("File sent sucessfully");
    }
}
