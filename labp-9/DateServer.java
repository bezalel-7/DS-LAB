import java.rmi.registry.*;

public class DateServer {
    public static void main(String[] args) {
        try {
            DateService dateService = new DateServiceImpl();
            LocateRegistry.createRegistry(1099);
            Registry registry = LocateRegistry.getRegistry(1099);
            registry.bind("DateService", dateService);
            System.out.println("DateService is running");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
