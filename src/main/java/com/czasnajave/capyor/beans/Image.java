package com.czasnajave.capyor.beans;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

/**
 * Created by Exilion on 2017-02-08.
 */
@Entity
@Table(name = "image")
public class Image {

    @Id
    @GeneratedValue
    private Long id;


    @NotEmpty
    @Column(name="url", nullable=false)
    private String url;


    public Image( String url) {
        this.url = url;
    }

    public Image() {}

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getId() {
        return id;
    }
}
