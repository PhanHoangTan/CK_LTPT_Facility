package dao.impl;

import dao.FacilityDao;
import entity.Facility;
import entity.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FacilityImpl extends UnicastRemoteObject implements FacilityDao {
    private EntityManager em;


    public FacilityImpl() throws RemoteException {
        em = Persistence.createEntityManagerFactory("SQLdb").createEntityManager();
    }

    @Override
    public boolean updateFacility(Facility facilityNewInfo) throws RemoteException {
        EntityTransaction tx = null;

        try {
            tx = em.getTransaction();
            tx.begin();

            // Find the existing facility by ID
            Facility existingFacility = em.find(Facility.class, facilityNewInfo.getId());

            if (existingFacility == null) {
                return false; // Facility does not exist
            }

            // Update the description, location, and status
            existingFacility.setDescription(facilityNewInfo.getDescription());
            existingFacility.setLocation(facilityNewInfo.getLocation());
            existingFacility.setStatus(facilityNewInfo.getStatus());

            // Update the price only if the new price is lower than the current price
            if (facilityNewInfo.getPrice() < existingFacility.getPrice()) {
                existingFacility.setPrice(facilityNewInfo.getPrice());
            }

            em.merge(existingFacility);
            tx.commit();

            return true;
        } catch (Exception e) {
            if (tx != null && tx.isActive()) {
                tx.rollback();
            }
            e.printStackTrace();
            throw new RemoteException("Error updating facility", e);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    @Override
    public Map<Facility, Long> countMaintenance() throws RemoteException {
        try {
            List<Object[]> results = em.createQuery(
                            "SELECT m.facility, COUNT(m) FROM Maintenance m JOIN m.facility f GROUP BY m.facility ORDER BY f.facilityName ASC",
                            Object[].class)
                    .getResultList();

            Map<Facility, Long> maintenanceCounts = new LinkedHashMap<>();
            for (Object[] result : results) {
                maintenanceCounts.put((Facility) result[0], (Long) result[1]);
            }

            return maintenanceCounts;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RemoteException("Error counting maintenance", e);
        }
    }








}
