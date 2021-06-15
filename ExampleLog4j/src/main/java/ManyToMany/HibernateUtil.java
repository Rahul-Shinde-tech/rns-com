package ManyToMany;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.w3c.dom.DOMConfiguration;

public class HibernateUtil {
	public static Session session;
	public static SessionFactory factory;
	static Logger logger = Logger.getLogger(HibernateUtil.class);

	public static SessionFactory getSessionfactory() {
		DOMConfigurator.configure("log4j.xml");
		try {
			logger.info("Configured Suceessfully:");
			Configuration config = new Configuration().configure();
			return factory = config.buildSessionFactory();

		} catch (Exception e) {
			logger.error("Conflit in Configuration");
			e.printStackTrace();
		}
		return factory;
	}
	public static Session getSession() {
		DOMConfigurator.configure("log4j.xml");
		try{
			logger.info("Session Opened:");
			return session= getSessionfactory().openSession();
			
		}
		catch(Exception e) {
			logger.error("Conflict in Session:");
			e.printStackTrace();
		}
		return session;
	}
}
