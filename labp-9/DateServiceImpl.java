import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;
import java.rmi.Remote;

public class DateServiceImpl extends UnicastRemoteObject implements DateService {
    protected DateServiceImpl() throws RemoteException {
        super();
    }

    @Override
    public Date getCurrentDate() throws RemoteException {
        return new Date();
    }
}