package dao;

import entity.Facility;
import entity.Person;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import java.util.Map;

public interface FacilityDao extends Remote {
    public boolean updateFacility(Facility facilityNewInfo) throws RemoteException;
    public Map<Facility, Long> countMaintenance() throws RemoteException;
}
