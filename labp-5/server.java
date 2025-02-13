import java.io.*;
import java.net.*;

public class server {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(3333);
        Socket s = ss.accept();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());

        String str = "";
        while (!(str.equals("stop"))) {
            str = din.readUTF();
            System.out.println("Client says " + str);
            str = br.readLine();
            dout.writeUTF(str);
            dout.flush();
        }
        din.close();
        dout.close();
        ss.close();

    }
}