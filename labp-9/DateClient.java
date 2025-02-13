import java.util.*;
import java.rmi.registry.*;

public class DateClient {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            DateService dateService = (DateService) registry.lookup("DateService");
            Date currenDate = dateService.getCurrentDate();
            System.out.println("Current Date and time is " + currenDate);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
