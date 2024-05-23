import entity.Facility;
import entity.Person;
import entity.Status;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 4591);
             Scanner scanner = new Scanner(System.in);
             DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
             DataInputStream dis = new DataInputStream(socket.getInputStream());
             ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
             ObjectInputStream ois = new ObjectInputStream(socket.getInputStream())) {

            System.out.println("Connected to server");
            int choice = 0;
            while (true) {
                System.out.println("1. Cau A");
                System.out.println("2. Cau B");
                System.out.println("3. Cau C");
                System.out.println("4. Exit");

                System.out.println("Enter your choice: ");
                choice = scanner.nextInt();
                dos.writeInt(choice);

                switch (choice) {
                    case 1:
                        // Làm sạch bộ đệm của Scanner
                        scanner.nextLine();
// Prompt the user to enter the facility name
                        System.out.println("Enter the facility name:");
                        String facilityName = scanner.nextLine(); // Sử dụng nextLine() để nhận cả dòng văn bản

// Gửi tên cơ sở vật chất đến server
                        dos.writeUTF(facilityName);
                        List<Person> persons = (List<Person>) ois.readObject();
                        persons.forEach(System.out::println);
                        dos.flush(); // Đảm bảo dữ liệu được gửi ngay lập tức
                        break;
                    case 2:
                        // Khởi tạo đối tượng Scanner cho việc nhập dữ liệu từ bàn phím
                        Scanner scanner = new Scanner(System.in);

                        // Prompt người dùng nhập thông tin mới cho cơ sở vật chất
                        System.out.println("Enter new facility information:");
                        System.out.print("ID: ");
                        String id = scanner.nextLine(); // Nhập ID của cơ sở vật chất

                        System.out.print("Description: ");
                        String description = scanner.nextLine(); // Nhập mô tả của cơ sở vật chất

                        System.out.print("Location: ");
                        String location = scanner.nextLine(); // Nhập vị trí của cơ sở vật chất

                        System.out.print("Status: ");
                        String status = scanner.nextLine(); // Nhập trạng thái của cơ sở vật chất

                        System.out.print("Price: ");
                        double price = scanner.nextDouble(); // Nhập giá của cơ sở vật chất

                        // Tạo một đối tượng Facility mới với thông tin được nhập từ client
                        Facility facilityNewInfo = new Facility();

                        // Gửi thông tin về cơ sở vật chất mới đến máy chủ
                        oos.writeObject(facilityNewInfo);
                        oos.flush(); // Đảm bảo dữ liệu được gửi ngay lập tức

                        break;


                    case 3:
                        dos.writeInt(3);
                        try{
                            Map<Facility,Long> facilityStatistics = (Map<Facility, Long>) ois.readObject();
                            System.out.println("Facility Statistics:");
                            for (Map.Entry<Facility, Long> entry : facilityStatistics.entrySet()) {
                                System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
                            }
                        } catch (ClassNotFoundException e) {
                            e.printStackTrace();
                        }
                        break;
                    case 4:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice");
                        break;
                }
            }
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}


