import dao.FacilityDao;
import dao.PersonDao;
import dao.impl.FacilityImpl;
import dao.impl.PersonImpl;
import entity.Facility;
import entity.Person;
import entity.Status;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.rmi.RemoteException;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import static entity.Status.UNDER_MAINTENANCE;
import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class TestMain {
    static FacilityDao facilityDao;
    static PersonDao    personDao;
    @BeforeAll
    static void setUp() throws Exception {
        facilityDao = new FacilityImpl();
        personDao = new PersonImpl();
    }
    @Test
    void testGetMaintenancesWorker() throws RemoteException {
        String facilityName = "Air Conditioner H91 - 1";
        List<Person> actualPersons = personDao.getMaintenancesWorker(facilityName);
        assertEquals(3, actualPersons.size());
        personDao.getMaintenancesWorker(facilityName).forEach(System.out::println);
        }
    @Test
    void testGetMaintenancesWorker2() throws RemoteException {
        String facilityName = "Air Conditioner H91 - 1";
        List<Person> actualPersons = personDao.getMaintenancesWorker(facilityName);
        assertEquals(4, actualPersons.size());
        personDao.getMaintenancesWorker(facilityName).forEach(System.out::println);
    }
    @Test
    void testUpdateFacility() throws RemoteException {
        FacilityDao facilityDao = new FacilityImpl();
        Facility facilityNewInfo = new Facility(); // replace with your new facility info

        // Set the properties of facilityNewInfo here
         facilityNewInfo.setId("H91Ai01");
         facilityNewInfo.setDescription("Haha");
         facilityNewInfo.setLocation("Hanoi");
         facilityNewInfo.setStatus(UNDER_MAINTENANCE);
         facilityNewInfo.setPrice(100);

        boolean result = facilityDao.updateFacility(facilityNewInfo);
        System.out.println("Update result: " + result);
    }
    @Test
    void testUpdateFacility1() throws RemoteException {
        FacilityDao facilityDao = new FacilityImpl();
        Facility facilityNewInfo = new Facility(); // replace with your new facility info

        // Set the properties of facilityNewInfo here
        facilityNewInfo.setId("H91Ai01");
        facilityNewInfo.setDescription("Haha");
        facilityNewInfo.setLocation("Hanoi");
        facilityNewInfo.setStatus(UNDER_MAINTENANCE);
        facilityNewInfo.setPrice(100);

        boolean expected = false; // replace with your expected result
        boolean actual = facilityDao.updateFacility(facilityNewInfo);
        assertEquals(expected, actual);
    }

    @Test
    void testCountMaintenance() throws RemoteException {
        Map<Facility, Long> maintenanceCounts = facilityDao.countMaintenance();
        maintenanceCounts.forEach((k, v) -> System.out.println(k + " " + v));
    }
    @Test
    void testCountMaintenance2() throws RemoteException {
        // Define expected size
        int expectedSize = 15; // Adjust this value according to your expected size

        // Get actual maintenance counts
        Map<Facility, Long> actualMaintenanceCounts = facilityDao.countMaintenance();

        // Compare actual size with expected size
        assertEquals(expectedSize, actualMaintenanceCounts.size());
    }
    @AfterAll
    static void tearDown()  {
        facilityDao = null;
        personDao = null;
    }


}
