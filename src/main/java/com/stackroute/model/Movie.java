package com.stackroute.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/* Annotate the class with @Entity annotation*/
public class Movie {

    /*id is annotated with @Id*/
    private int id;
    private String movieName;
    private String language;
    private String genre;


    public Movie() {
    }

    /* Write parameterized constructor */

    /* Add getter and setter methods for all the properties */
}
