import java.io.*;
import java.net.*;

public class client {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 3333);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        String str = "";
        while (!(str.equals("stop"))) {
            str = br.readLine();
            dout.writeUTF(str);
            dout.flush();
            str = din.readUTF();
            System.out.println("Server says " + str);
        }
        din.close();
        dout.close();
        s.close();
    }
}