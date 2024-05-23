package server;

import dao.FacilityDao;
import dao.PersonDao;
import dao.impl.FacilityImpl;
import dao.impl.PersonImpl;
import entity.Facility;
import entity.Person;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.rmi.RemoteException;
import java.util.List;

public class Server {
    public Server() {
    }

    public static void main(String[] args) {
        try{
            ServerSocket serverSocket = new ServerSocket(4591);
            try{
                System.out.println("Server is running...");
                while(true){
                    Socket socket = serverSocket.accept();
                    System.out.println("New client connected");
                    System.out.println("Client IP: " + socket.getInetAddress().getHostAddress());
                    Thread t = new Thread(new ClientHandler(socket));
                    t.start();
                }
            } catch (Throwable var5){
                try{
                    serverSocket.close();
                } catch (Throwable var4){
                    var5.addSuppressed(var4);
                }
                throw var5;
            }
    }catch (Exception var6) {
            System.out.println("Server exception " + var6.getMessage());
        }

}}
class ClientHandler implements Runnable {
    private Socket socket;
    private FacilityDao facilityDao;
    private PersonDao personDao;

    public ClientHandler(Socket socket) throws Exception {
        this.socket = socket;
        this.facilityDao = new FacilityImpl();
        this.personDao = new PersonImpl();
    }

    @Override
    public void run() {
        try (ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
             DataInputStream dis = new DataInputStream(socket.getInputStream())) {
            int choice;
            while (true) {
                try {
                    choice = dis.readInt();
                } catch (EOFException var11) {
                    System.out.println("End of stream reached unexpectedly");
                    return;
                }
                switch (choice) {

                    case 1:
                        try {
                            // Nhận tên của cơ sở vật chất từ client
                            String facilityName = dis.readUTF();

                            // Sử dụng tên cơ sở vật chất để lấy danh sách người làm bảo trì từ DAO
                            List<Person> persons = personDao.getMaintenancesWorker(facilityName);

                            // Gửi danh sách người làm bảo trì đến client
                            oos.writeObject(persons);
                            oos.flush(); // Đảm bảo dữ liệu được gửi ngay lập tức
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;

                    case 2:
                        Facility facilityNewInfo = (Facility) ois.readObject();
                        boolean result = facilityDao.updateFacility(facilityNewInfo);
                        dos.writeBoolean(result);
                        dos.flush(); // ensure the data is sent immediately
                        break;
                    case 3:
                        //public Map<Facility, Long> countMaintenance() throws RemoteException
                        oos.writeObject(facilityDao.countMaintenance());
                        break;
                    default:
                        System.out.println("Invalid choice");
                        break;
                }
            }
        } catch (IOException e) {
            System.out.println("Client disconnected");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

