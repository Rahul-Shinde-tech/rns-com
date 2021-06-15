package ManyToMany;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.apache.logging.log4j.core.util.ArrayUtils;
import org.hibernate.Session;

public class Testmain {
	static Logger logger = Logger.getLogger(Testmain.class);
	static Session session;
	
	
	public static void main(String[] args) throws Exception {
		DOMConfigurator.configure("log4j.xml");
		logger.info("Project Started :");
		
		Customer customerfirst = new Customer();
		customerfirst.setCustomerName("Sachin");
		customerfirst.setPhoneNo(3222344);
		
		Customer customersecond = new Customer();
		customersecond.setCustomerName("Youvraj");
		customersecond.setPhoneNo(847347);
		
		Customer customerthird = new Customer();
		customerthird.setCustomerName("Irfan");
		customerthird.setPhoneNo(35436366);

		Orders orderfirst = new Orders();
		orderfirst.setMenuName("PavBhaji");
		
		Orders ordersecond = new Orders();
		ordersecond.setMenuName("Paratha");
		
		Orders orderthird = new Orders();
		orderthird.setMenuName("Veg Biryani");
		
		Orders orderfourth = new Orders();
		orderfourth.setMenuName("DalMakhani");
		
		List<Orders> listorderfirst = new ArrayList<Orders>();
		listorderfirst.add(orderfirst);
		listorderfirst.add(orderthird);
		
		List<Orders> listordersecond = new ArrayList<>();
		listordersecond.add(ordersecond);
		listordersecond.add(orderfourth);
		
		customerfirst.setOrder(listorderfirst);
		
		customersecond.setOrder(listordersecond);
		
		List<Customer> customerlistfirst = new ArrayList<>();
		customerlistfirst.add(customerthird);
		customerlistfirst.add(customersecond);
		
		orderthird.setCustomer(customerlistfirst);
		
		logger.info("Started saving Customer Details:");
		
		session=HibernateUtil.getSession();
		session.beginTransaction();
		
		
		saveCustomer(customerfirst);
		logger.info("New Customer Saved");
		saveCustomer(customersecond);
		logger.info("New Customer Saved");
		saveCustomer(customerthird);
		logger.info("New Customer Saved");
		
		logger.info("Started Saving Orders:");
		saveOrders(orderfirst);
		logger.info("New Order Saved");
		saveOrders(ordersecond);
		logger.info("New Order Saved");
		saveOrders(orderthird);
		logger.info("New Order Saved");
		saveOrders(orderfourth);
		logger.info("New Order Saved");
		
		session.getTransaction().commit();
		session.close();
		
		logger.info("Sucessful..");
	}
	
	public static void saveCustomer(Customer customer) throws Exception {
		//Customer newcustomer = customer;
		
		/*session=HibernateUtil.getSession();
		session.beginTransaction();*/
	
		session.save(customer);
		
		
		/*session.getTransaction().commit();
		session.close();*/
	}
	
	public static void saveOrders(Orders orders) throws Exception {
		//Orders neworder = orders;
		
		/*session=HibernateUtil.getSession();
		session.beginTransaction();
	*/
		session.save(orders);
		
		/*session.getTransaction().commit();
		session.close();*/
		
	}
	
	
}
