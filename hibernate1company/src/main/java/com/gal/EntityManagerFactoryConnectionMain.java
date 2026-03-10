package com.gal;

import java.sql.Date;
import java.time.LocalDate;

import com.gal.dao.ItemDao;
import com.gal.dao.ParkingDao;
import com.gal.dao.ProjectDao;
import com.gal.dao.ProjectManagerDao;
import com.gal.dao.QuotationDao;
import com.gal.dao.VendorDao;
import com.gal.model.Item;
import com.gal.model.Parking;
import com.gal.model.Project;
import com.gal.model.ProjectManager;
import com.gal.model.Quotation;
import com.gal.model.Vendor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EntityManagerFactoryConnectionMain {

    private static EntityManagerFactory emf = null;
    private static EntityManager em = null;

    public static EntityManagerFactory getEntityManagerFactory() {
        if (emf == null || !emf.isOpen()) {
            emf = Persistence.createEntityManagerFactory("company_db_pu");
        }
        return emf;
    }

    public static EntityManager getEntityManger() {
        if (emf == null)
            getEntityManagerFactory();

        if (em == null || !em.isOpen())
            em = emf.createEntityManager();

        return em;
    }
    public static void closeConnections() {
		getEntityManger().close();
		getEntityManagerFactory().close();
	}

    
    public static void main(String[] args) {
    	VendorDao vendorDao = new VendorDao();
        ProjectManagerDao managerDao = new ProjectManagerDao();
        ProjectDao projectDao = new ProjectDao();
        QuotationDao quotationDao = new QuotationDao();
        ItemDao itemDao = new ItemDao();
        ParkingDao parkingDao = new ParkingDao();

        Vendor v1 = new Vendor(0,"ABC Suppliers","Hardware","9999999999");
        Vendor v2 = new Vendor(0,"Tech Electronics","Electronics","8888888888");
        vendorDao.addVendor(v1);
        vendorDao.addVendor(v2);
        System.out.println("Vendors inserted");
        ProjectManager pm1 =
                new ProjectManager("JONES","jones@gmail.com");
        ProjectManager pm2 =
                new ProjectManager("BLAKE","blake@gmail.com");
        managerDao.addManager(pm1);
        managerDao.addManager(pm2);
        System.out.println("Managers inserted");
        Project p1 = new Project(
                "Metro Project",
                "Delhi Govt",
                LocalDate.now(),
                LocalDate.now().plusMonths(6),
                500000,
                pm1
        );

        Project p2 = new Project(
                "Smart City",
                "UP Govt",
                LocalDate.now(),
                LocalDate.now().plusMonths(12),
                900000,
                pm2
        );
        projectDao.addProject(p1);
        projectDao.addProject(p2);
        System.out.println("Projects inserted");
        Quotation q1 = new Quotation();
        q1.setQdate(Date.valueOf(LocalDate.now()));
        q1.setCost(25000.0);
        Quotation q2 = new Quotation();
        q2.setQdate(Date.valueOf(LocalDate.now()));
        q2.setCost(40000.0);
        quotationDao.addQuotation(q1);
        quotationDao.addQuotation(q2);
        System.out.println("Quotations inserted");
        Item item1 = new Item("electronics","Tab",10000.0);
        Item item2 = new Item("electronics","Smart Watch",5000.0);
        itemDao.addItem(item1);
        itemDao.addItem(item2);
        System.out.println("Items inserted");
        Parking p1parking = new Parking(0,1,"S001");
        Parking p2parking = new Parking(0,1,"S002");
        parkingDao.addParking(p1parking);
        parkingDao.addParking(p2parking);
        System.out.println("Parking inserted");
        EntityManagerFactoryConnectionMain.closeConnections();
        System.out.println("All data inserted successfully!");
    }
}