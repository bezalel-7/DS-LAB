import java.io.*;
import java.net.*;

public class Dns {
    public static void main(String[] args) {
        int n;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.println("\n Menu: \n 1. DNS 2. Reverse DNS 3. Exit \n");
            System.out.println("\n Enter your choice");
            n = Integer.parseInt(System.console().readLine());
            if (n == 1 || n == 2) {
                try {
                    if (n == 1)
                        System.out.println("\n Enter Host Name ");
                    else
                        System.out.println("Enter the ip address");
                    String hname = in.readLine();
                    InetAddress address;
                    address = InetAddress.getByName(hname);
                    System.out.println(address);
                    if (n == 1) {
                        System.out.println("Host Name: " + address.getHostName());
                        System.out.println("IP: " + address.getHostAddress());
                    } else {
                        System.out.println("Host Name: " + address.getHostName());
                    }
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }
            }

        } while (!(n == 3));
    }
}