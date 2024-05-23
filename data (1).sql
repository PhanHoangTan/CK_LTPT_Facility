-- Inserting data into the people table

INSERT INTO people(person_id,full_name,position,phone,email) VALUES('P101','John Doe','Lecturer','465-545-0903','JohnDoe@gmail.com');
INSERT INTO people(person_id,full_name,position,phone,email) VALUES('P102','Jill Johnson','Dean','879-545-2363','JillJohnson@gmail.com');
INSERT INTO people(person_id,full_name,position,phone,email) VALUES('P103','Jack Wilson','Professor','345-654-8754','JackWilson@gmail.com');
INSERT INTO people(person_id,full_name,position,phone,email) VALUES('P104','Jane Smith','Instructor','234-123-1234','JaneSmith@gmail.com');
INSERT INTO people(person_id,full_name,position,phone,email) VALUES('P105','Jerry Brown','Lecturer','234-234-4209','JerryBrown@gmail.com');
INSERT INTO people(person_id,full_name,position,phone,email) VALUES('P106','Jack White','Associate Professor','890-234-2342','JackWhite@gmail.com');
INSERT INTO people(person_id,full_name,position,phone,email) VALUES('P107','Jose Herrera','Office Manager','234-765-0963','JoseHerrera@gmail.com');
INSERT INTO people(person_id,full_name,position,phone,email) VALUES('P108','Maria Garcia','Support Staff','234-454-8730','MariaGarcia@gmail.com');
INSERT INTO people(person_id,full_name,position,phone,email) VALUES('P109','Carlos Martinez','Technical support staff','234-234-0001','CarlosMartinez@gmail.com');
INSERT INTO people(person_id,full_name,position,phone,email) VALUES('P110','Ana Lopez','Support Staff','234-234-9006','AnaLopez@gmail.com');
INSERT INTO people(person_id,full_name,position,phone,email) VALUES('P111','John Smith','Technical support staff','465-545-9999','JohnSmith@gmail.com');
INSERT INTO people(person_id,full_name,position,phone,email) VALUES('P112','Jill Hill','Technical support staff','879-545-6666','JillHill@gmail.com');
INSERT INTO people(person_id,full_name,position,phone,email) VALUES('P113','Jack Doe','Technical support staff','345-654-1111','JackDoe@gmail.com');
INSERT INTO people(person_id,full_name,position,phone,email) VALUES('P114','Jane Johnson','Technical support staff','234-123-7653','JaneJohnson@gmail.com');
INSERT INTO people(person_id,full_name,position,phone,email) VALUES('P115','Jerry Wilson','Technical support staff','234-234-6767','JerryWilson@gmail.com');

SELECT * FROM people;

-- Inserting data into the departments table

INSERT INTO departments(department_id,department_name,location,manager_id) VALUES('ITF','Faculty of Information Technology','1st Floor of Building H','P101');
INSERT INTO departments(department_id,department_name,location,manager_id) VALUES('BF','Faculty of Business Administration','2nd Floor of Building V','P102');
INSERT INTO departments(department_id,department_name,location,manager_id) VALUES('EF','Faculty of Engineering','6rd Floor of Building X','P103');
INSERT INTO departments(department_id,department_name,location,manager_id) VALUES('BSF','Faculty of Basic Sciences','3rd Floor of Building D','P104');
INSERT INTO departments(department_id,department_name,location,manager_id) VALUES('HRD','Human Resources Department','2th Floor of Building E','P105');
INSERT INTO departments(department_id,department_name,location,manager_id) VALUES('FD','Finance Department','1nd Floor of Building E','P106');
INSERT INTO departments(department_id,department_name,location,manager_id) VALUES('LD','Library','3st Floor of Building A','P107');
INSERT INTO departments(department_id,department_name,location,manager_id) VALUES('TD','Training Department','1th Floor of Building B','P108');
INSERT INTO departments(department_id,department_name,location,manager_id) VALUES('FMD',' Equipment and technical management department','10th Floor of Building X','P109');
INSERT INTO departments(department_id,department_name,location,manager_id) VALUES('SD','Security Department','1th Floor of Building C','P110');
INSERT INTO departments(department_id,department_name,location,manager_id) VALUES('TC',' Testing Center','1th Floor of Building D','P111');

SELECT * FROM departments;


-- Inserting data into the facilities table

INSERT INTO facilities(facility_id,facility_name,description,purchase_date,price,status,location,department_id) VALUES('H91M01','Computer Lab H91 - 1','Core i7 computers with 16GB RAM','01/01/2022',1000,'IN_USE','room 9.1 - 9th Floor of Building H','ITF');
INSERT INTO facilities(facility_id,facility_name,description,purchase_date,price,status,location,department_id) VALUES('H91M02','Computer Lab H91 - 2','Core i7 computers with 16GB RAM','01/01/2022',1000,'IN_USE','room 9.1 - 9th Floor of Building H','ITF');
INSERT INTO facilities(facility_id,facility_name,description,purchase_date,price,status,location,department_id) VALUES('H91M03','Computer Lab H91 - 3','Core i7 computers with 16GB RAM','01/01/2022',1000,'IN_USE','room 9.1 - 9th Floor of Building H','ITF');
INSERT INTO facilities(facility_id,facility_name,description,purchase_date,price,status,location,department_id) VALUES('H91M04','Computer Lab H91 - 4','Core i7 computers with 16GB RAM','01/01/2022',1000,'IN_USE','room 9.1 - 9th Floor of Building H','ITF');
INSERT INTO facilities(facility_id,facility_name,description,purchase_date,price,status,location,department_id) VALUES('H91M05','Computer Lab H91 - 5','Core i7 computers with 16GB RAM','01/01/2022',1000,'IN_USE','room 9.1 - 9th Floor of Building H','ITF');
INSERT INTO facilities(facility_id,facility_name,description,purchase_date,price,status,location,department_id) VALUES('H91Pi01','Printer H91 - 1','HP LaserJet Pro M404dn','01/01/2022',500,'AVAILABLE','room 9.1 - 9th Floor of Building H','ITF');
INSERT INTO facilities(facility_id,facility_name,description,purchase_date,price,status,location,department_id) VALUES('H91Po02','Projector H91 - 1','Epson PowerLite 1781W','01/01/2022',800,'IN_USE','room 9.1 - 9th Floor of Building H','ITF');
INSERT INTO facilities(facility_id,facility_name,description,purchase_date,price,status,location,department_id) VALUES('H91Mo01','Modem H91 - 1','TP-Link Archer C7','01/01/2022',100,'IN_USE','room 9.1 - 9th Floor of Building H','ITF');
INSERT INTO facilities(facility_id,facility_name,description,purchase_date,price,status,location,department_id) VALUES('H91Ro01','Router H91 - 1','TP-Link Archer C7','01/01/2022',100,'IN_USE','room 9.1 - 9th Floor of Building H','ITF');
INSERT INTO facilities(facility_id,facility_name,description,purchase_date,price,status,location,department_id) VALUES('H91Sw01','Switch H91 - 1','TP-Link TL-SG108','01/01/2022',50,'IN_USE','room 9.1 - 9th Floor of Building H','ITF');
INSERT INTO facilities(facility_id,facility_name,description,purchase_date,price,status,location,department_id) VALUES('H91Ai01','Air Conditioner H91 - 1','Carrier 42QHC018DS','01/01/2022',2000,'IN_USE','room 9.1 - 9th Floor of Building H','ITF');
INSERT INTO facilities(facility_id,facility_name,description,purchase_date,price,status,location,department_id) VALUES('H91Ai02','Air Conditioner H91 - 2','Carrier 42QHC018DS','01/01/2022',2000,'IN_USE','room 9.1 - 9th Floor of Building H','ITF');
INSERT INTO facilities(facility_id,facility_name,description,purchase_date,price,status,location,department_id) VALUES('H91Fa01','Fan H91 - 1','Honeywell HT-900','01/01/2022',50,'UNDER_MAINTENANCE','room 9.1 - 9th Floor of Building H','ITF');
INSERT INTO facilities(facility_id,facility_name,description,purchase_date,price,status,location,department_id) VALUES('H91Li01','Light H91 - 1','Philips Hue White and Color Ambiance','01/01/2022',100,'IN_USE','room 9.1 - 9th Floor of Building H','ITF');
INSERT INTO facilities(facility_id,facility_name,description,purchase_date,price,status,location,department_id) VALUES('TDAi01','Air Conditioner TD - 1','Carrier 42QHC018DS','01/01/2022',2000,'IN_USE','room 1.1 - 1st Floor of Building B','TD');
INSERT INTO facilities(facility_id,facility_name,description,purchase_date,price,status,location,department_id) VALUES('TDAi02','Air Conditioner TD - 2','Carrier 42QHC018DS','01/01/2022',2000,'IN_USE','room 1.2 - 1st Floor of Building B','TD');
INSERT INTO facilities(facility_id,facility_name,description,purchase_date,price,status,location,department_id) VALUES('TDM01','Computer 1','Core i7 computers with 16GB RAM','01/01/2022',1000,'IN_USE','room 1.1 - 1st Floor of Building B','TD');
INSERT INTO facilities(facility_id,facility_name,description,purchase_date,price,status,location,department_id) VALUES('TDM02','Computer 2','Core i7 computers with 16GB RAM','01/01/2022',1000,'IN_USE','room 1.1 - 1st Floor of Building B','TD');
INSERT INTO facilities(facility_id,facility_name,description,purchase_date,price,status,location,department_id) VALUES('TDM03','Computer 3','Core i7 computers with 16GB RAM','01/01/2022',1000,'IN_USE','room 1.2 - 1st Floor of Building B','TD');
INSERT INTO facilities(facility_id,facility_name,description,purchase_date,price,status,location,department_id) VALUES('TDM04','Computer 4','Core i7 computers with 16GB RAM','01/01/2022',1000,'IN_USE','room 1.3 - 1st Floor of Building B','TD');
INSERT INTO facilities(facility_id,facility_name,description,purchase_date,price,status,location,department_id) VALUES('TDPi01','Printer TD - 1','HP LaserJet Pro M404dn','01/01/2022',500,'IN_USE','room 1.1 - 1st Floor of Building B','TD');
INSERT INTO facilities(facility_id,facility_name,description,purchase_date,price,status,location,department_id) VALUES('TDPo02','Projector TD - 1','Epson PowerLite 1781W','01/01/2022',800,'IN_USE','room 1.1 - 1st Floor of Building B','TD');
INSERT INTO facilities(facility_id,facility_name,description,purchase_date,price,status,location,department_id) VALUES('HRDAi01','Air Conditioner HRD - 1','Carrier 42QHC018DS','01/01/2022',2000,'IN_USE','room 2.1 - 2nd Floor of Building E','HRD');
INSERT INTO facilities(facility_id,facility_name,description,purchase_date,price,status,location,department_id) VALUES('HRDAi02','Air Conditioner HRD - 2','Carrier 42QHC018DS','01/01/2022',2000,'AVAILABLE','room 2.2 - 2nd Floor of Building E','HRD');
INSERT INTO facilities(facility_id,facility_name,description,purchase_date,price,status,location,department_id) VALUES('HRDM01','Computer 1','Core i7 computers with 16GB RAM','01/01/2022',1000,'IN_USE','room 2.1 - 2nd Floor of Building E','HRD');
INSERT INTO facilities(facility_id,facility_name,description,purchase_date,price,status,location,department_id) VALUES('HRDM02','Computer 2','Core i7 computers with 16GB RAM','01/01/2022',1000,'IN_USE','room 2.1 - 2nd Floor of Building E','HRD');
INSERT INTO facilities(facility_id,facility_name,description,purchase_date,price,status,location,department_id) VALUES('HRDM03','Computer 3','Core i7 computers with 16GB RAM','01/01/2022',1000,'IN_USE','room 2.2 - 2nd Floor of Building E','HRD');
INSERT INTO facilities(facility_id,facility_name,description,purchase_date,price,status,location,department_id) VALUES('HRDM04','Computer 4','Core i7 computers with 16GB RAM','01/01/2022',1000,'IN_USE','room 2.2 - 2nd Floor of Building E','HRD');
INSERT INTO facilities(facility_id,facility_name,description,purchase_date,price,status,location,department_id) VALUES('HRPi01','Printer HRD - 1','HP LaserJet Pro M404dn','01/01/2022',500,'IN_USE','room 2.1 - 2nd Floor of Building E','HRD');

SELECT * FROM facilities;

-- Inserting data into the maintenances table

INSERT INTO maintenances(facility_id,person_id, start_date,end_date,description,cost) VALUES('H91Ai01','P109','2023/01/19','2023/01/19','Clean the nozzle',0);
INSERT INTO maintenances(facility_id,person_id, start_date,end_date,description,cost) VALUES('H91Ai01','P114','2023/01/11','2023/01/11','Update the firmware',200);
INSERT INTO maintenances(facility_id,person_id, start_date,end_date,description,cost) VALUES('H91Ai01','P115','2022/01/21','2022/01/22','Replace the z-axis motor',1100);
INSERT INTO maintenances(facility_id,person_id, start_date,end_date,description,cost) VALUES('H91Ai01','P113','2023/01/23','2023/01/23','Upgrade the graphics card',400);
INSERT INTO maintenances(facility_id,person_id, start_date,end_date,description,cost) VALUES('H91M01','P110','2022/01/03','2022/01/03','Clean the nozzle',0);
INSERT INTO maintenances(facility_id,person_id, start_date,end_date,description,cost) VALUES('H91M01','P113','2022/01/05','2022/01/10','Replace the power supply',300);
INSERT INTO maintenances(facility_id,person_id, start_date,end_date,description,cost) VALUES('H91M02','P112','2023/04/01','2023/04/05','Replace the heated bed',700);
INSERT INTO maintenances(facility_id,person_id, start_date,end_date,description,cost) VALUES('H91M03','P113','2024/01/03','2024/01/03','Check the power supply',0);
INSERT INTO maintenances(facility_id,person_id, start_date,end_date,description,cost) VALUES('H91M04','P114','2022/02/07','2022/02/07','Upgrade the graphics card',400);
INSERT INTO maintenances(facility_id,person_id, start_date,end_date,description,cost) VALUES('H91M05','P115','2022/02/09','2022/02/09','Check the power supply',0);
INSERT INTO maintenances(facility_id,person_id, start_date,end_date,description,cost) VALUES('H91Mo01','P109','2022/01/11','2022/01/11','Upgrade the extruder',600);
INSERT INTO maintenances(facility_id,person_id, start_date,end_date,description,cost) VALUES('H91Pi01','P109','2023/07/09','2023/07/09','Replace the z-axis motor',1100);
INSERT INTO maintenances(facility_id,person_id, start_date,end_date,description,cost) VALUES('H91Pi01','P114','2023/03/05','2023/03/05','Replace the power supply',900);
INSERT INTO maintenances(facility_id,person_id, start_date,end_date,description,cost) VALUES('H91Po02','P112','2022/01/13','2022/01/13','Replace the heated bed',700);
INSERT INTO maintenances(facility_id,person_id, start_date,end_date,description,cost) VALUES('H91Po02','P114','2022/01/17','2022/01/17','Replace the power supply',900);
INSERT INTO maintenances(facility_id,person_id, start_date,end_date,description,cost) VALUES('H91Ro01','P110','2023/06/21','2023/06/21','Replace the power supply',300);
INSERT INTO maintenances(facility_id,person_id, start_date,end_date,description,cost) VALUES('HRDAi01','P114','2023/01/25','2023/01/28','Add the heated bed',500);
INSERT INTO maintenances(facility_id,person_id, start_date,end_date,description,cost) VALUES('HRDM01','P113','2022/01/15','2022/01/15','Update drivers',0);
INSERT INTO maintenances(facility_id,person_id, start_date,end_date,description,cost) VALUES('HRPi01','P115','2024/08/17','2024/08/18','Replace the power supply',1500);
INSERT INTO maintenances(facility_id,person_id, start_date,end_date,description,cost) VALUES('HRPi01','P113','2022/01/19','2022/01/19','Upgrade the graphics card',1000);
INSERT INTO maintenances(facility_id,person_id, start_date,end_date,description,cost) VALUES('TDAi02','P114','2023/04/15','2023/04/15','Clean the nozzle',0);
INSERT INTO maintenances(facility_id,person_id, start_date,end_date,description,cost) VALUES('TDAi02','P115','2023/01/07','2023/01/07','Upgrade the graphics card',0);
INSERT INTO maintenances(facility_id,person_id, start_date,end_date,description,cost) VALUES('TDM02','P110','2023/01/21','2023/01/21','Install the software',0);
INSERT INTO maintenances(facility_id,person_id, start_date,end_date,description,cost) VALUES('TDM03','P109','2022/09/01','2022/09/01','Update the windows',0);
INSERT INTO maintenances(facility_id,person_id, start_date,end_date,description,cost) VALUES('TDPi01','P113','2023/01/13','2023/01/15','Replace the heated bed',1300);

select * from maintenances


select * from [dbo].[departments]
select * from maintenances
select * from [dbo].[facilities]
select * from [dbo].[people]
