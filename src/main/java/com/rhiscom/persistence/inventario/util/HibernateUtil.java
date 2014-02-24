package com.rhiscom.persistence.inventario.util;
 
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;
 
public class HibernateUtil {
 
	private static final SessionFactory sessionFactory = buildSessionFactory();
	private static final SessionFactory sessionFactoryXXOSI = buildSessionFactoryXXOSI();
 
	private static SessionFactory buildSessionFactory() {
		try {
			// Create the SessionFactory from hibernate.cfg.xml			
			return new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		} catch (Throwable ex) {
			// Make sure you log the exception, as it might be swallowed
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
 
	private static SessionFactory buildSessionFactoryXXOSI() {
		try {
			// Create the SessionFactory from hibernateXXOSI.cfg.xml
			return new Configuration().configure("hibernateXXOSI.cfg.xml").buildSessionFactory();
		} catch (Throwable ex) {
			// Make sure you log the exception, as it might be swallowed
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
	
	private static SessionFactory buildSessionFactoryXXOSI(String url, String schema, String username, String password) {
		try {
			// Create the SessionFactory from parameters
			Configuration conf = new Configuration().configure();
			conf.setProperty("hibernate.connection.driver_class", "oracle.jdbc.driver.OracleDriver");
			//conf.setProperty("hibernate.connection.url", "jdbc:oracle:thin:@128.1.175.138:1521:XE");
			conf.setProperty("hibernate.connection.url", url);
			if (!schema.equals("")){
				conf.setProperty("hibernate.connection.default_schema", schema);
			}			
			conf.setProperty("hibernate.connection.username", username);
			conf.setProperty("hibernate.connection.password", password);
			conf.setProperty("hibernate.connection.pool_size", "1");
			conf.setProperty("hibernate.dialect", "org.hibernate.dialect.Oracle10gDialect");
			conf.setProperty("hibernate.current_session_context_class", "thread");
			conf.setProperty("hibernate.cache.provider_class", "org.hibernate.cache.NoCacheProvider");
			conf.setProperty("hibernate.show_sql", "false");
			conf.setProperty("hibernate.hbm2ddl.auto", "validate");			
			return conf.buildSessionFactory(new ServiceRegistryBuilder().applySettings(conf.getProperties()).buildServiceRegistry());
		} catch (Throwable ex) {
			// Make sure you log the exception, as it might be swallowed
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}


	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public static SessionFactory getSessionFactoryXXOSI() {
		return sessionFactoryXXOSI;
	}
	
	public static SessionFactory getSessionFactoryXXOSI(String url, String schema, String username, String password){
		return buildSessionFactoryXXOSI(url, schema, username, password);
	}
 
	public static void shutdown() {
		// Close caches and connection pools
		getSessionFactory().close();
	}
 
}