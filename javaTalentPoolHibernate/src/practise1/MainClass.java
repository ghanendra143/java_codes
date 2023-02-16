package practise1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {

	public static void main(String[] args) {
		Configuration conf = new Configuration();
		conf.configure();
		SessionFactory sf = conf.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tran = session.beginTransaction();    
		
		Customer cust = new Customer();
		cust.setCust_name("raju");
		cust.setCust_address("punjab");
		cust.setCust_phone(392843);
		
		System.out.println("data inerted");
		
		session.save(cust);
		tran.commit();
		session.close();
	}

}
