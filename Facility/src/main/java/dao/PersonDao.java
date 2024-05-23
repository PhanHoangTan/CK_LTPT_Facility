package dao;

import entity.Person;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface PersonDao extends Remote {
    public List<Person> getMaintenancesWorker(String FacilityName) throws RemoteException;
}
