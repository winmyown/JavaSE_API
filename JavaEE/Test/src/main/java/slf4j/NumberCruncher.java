package slf4j;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by admin on 2016-10-22.
 */
public interface NumberCruncher extends Remote {
    /**
     * Factor a positive integer number and return its
     * distinct factor's as an integer array.
     * */
    int[] factor(int number) throws RemoteException;
}