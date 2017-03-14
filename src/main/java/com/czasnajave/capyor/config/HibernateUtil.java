package com.czasnajave.capyor.config;
import com.czasnajave.capyor.beans.Image;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {



    private static final SessionFactory ourSessionFactory;
    private static final ServiceRegistry serviceRegistry;

    static {
        try {

            Configuration configuration = new Configuration();

configuration.addAnnotatedClass(Image.class);
            serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
            ourSessionFactory = configuration.buildSessionFactory(serviceRegistry);
        } catch (Throwable ex) {
            System.err.println("Enitial SessionFactory creation failed" + ex);

            throw new ExceptionInInitializerError(ex);
        }
    }



    public static SessionFactory getSessionFactory() {

        return ourSessionFactory;

    }


}
