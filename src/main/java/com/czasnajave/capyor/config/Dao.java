import com.czasnajave.capyor.beans.Image;
import com.czasnajave.capyor.beans.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


public abstract class Dao {


    private static SessionFactory ourSessionFactory;
    private static ServiceRegistry serviceRegistry;


    public Session session()
    {
        SessionFactory sessFact =  getSessionFactory();
        Session session = sessFact.getCurrentSession();
        return  session;
    }


    public static SessionFactory getSessionFactory() {

        return ourSessionFactory;

    }

    public void save(Object object){
        org.hibernate.Transaction tr = session().beginTransaction();
        session().save(object);
        tr.commit();
    }



    public void databaseConnection()
    {
        try {

            Configuration configuration = new Configuration();

            configuration.addAnnotatedClass(User.class);
            configuration.addAnnotatedClass(Image.class);
            serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
            ourSessionFactory = configuration.buildSessionFactory(serviceRegistry);
        } catch (Throwable ex) {
            System.err.println("Enitial SessionFactory creation failed" + ex);

            throw new ExceptionInInitializerError(ex);
        }
    }
}
