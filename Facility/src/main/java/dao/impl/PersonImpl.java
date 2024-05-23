package dao.impl;

import dao.PersonDao;
import entity.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class PersonImpl extends UnicastRemoteObject implements PersonDao {
    private EntityManager em;

    public PersonImpl() throws RemoteException {
        em = Persistence.createEntityManagerFactory("SQLdb").createEntityManager();
    }

    //Liet ke danh sach nhung nguoi da tung bao tri co so vat chat nao do khi biet ten FacilityName va co chi phi lon hon 0
    @Override
    public List<Person> getMaintenancesWorker(String FacilityName) throws RemoteException {
        return em.createNamedQuery("Person.getMaintainedPersons", Person.class)
                .setParameter("facilityName", FacilityName)
                .getResultList();
    }
}
