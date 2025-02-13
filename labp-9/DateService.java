import java.rmi.*;
import java.rmi.RemoteException;
import java.util.*;

public interface DateService extends Remote {
    Date getCurrentDate() throws RemoteException;
}
