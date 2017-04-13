package com.czasnajave.capyor.service;

import com.czasnajave.capyor.beans.Image;
import com.czasnajave.capyor.config.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;



@Service("imageService")
public class ImageServiceImpl extends HibernateUtil implements ImageService {





    @Override
    public void addImage(Image image)
    {
        save(image);
        System.out.println("Image: " + image.getUrl() + " successful added" );
    }

}
