import java.io.*;
import java.net.*;
import java.util.Arrays;

public class client {
    public static void main(String[] args) throws Exception {
        System.out.println("Starting client");
        Socket s = new Socket("localhost", 3333);
        InputStream is = s.getInputStream();
        byte b[] = new byte[2222];
        FileOutputStream fr = new FileOutputStream("/Users/varadudi/Desktop/DS-LAB/labp-3/output.txt");
        is.read(b, 0, b.length);
        fr.write(b, 0, b.length);
        System.out.println("file recieved sucessfully");
        // byte g[] = new byte[2222];
        // FileInputStream frr = new
        // FileInputStream("/Users/varadudi/Desktop/DS-LAB/labp-3/output.txt");
        // frr.read(g, 0, g.length);
        // System.out.println("content recieved is" + Arrays.toString(g));
    }
}
