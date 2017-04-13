package com.czasnajave.capyor.config;
import com.czasnajave.capyor.beans.Image;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class HibernateUtil extends Dao  implements ServletContextListener {



    @Override
    public void contextInitialized(ServletContextEvent sce) {
        databaseConnection();
    }


    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
