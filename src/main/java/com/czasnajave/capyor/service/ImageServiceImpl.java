package com.czasnajave.capyor.service;

import com.czasnajave.capyor.beans.Image;
import com.czasnajave.capyor.config.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;

/**
 * Created by Exilion on 2017-02-08.
 */

@Service("imageService")
public class ImageServiceImpl implements ImageService {



    @Override
    public void addImage(Image image)
    {


        HibernateUtil hibernateUtil = new HibernateUtil();
        SessionFactory sessFact = hibernateUtil.getSessionFactory();
        Session session = sessFact.getCurrentSession();
        org.hibernate.Transaction tr = session.beginTransaction();

        System.out.println(image.getId());
        System.out.println(image.getUrl());


        session.save(image);
        session.getTransaction().commit();

        tr.commit();
    }

}
