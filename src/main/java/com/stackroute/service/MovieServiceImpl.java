package com.stackroute.service;

import com.stackroute.dao.MovieRepository;
import com.stackroute.exceptions.MovieAlreadyExistException;
import com.stackroute.exceptions.MovieNotFoundException;
import com.stackroute.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/* Annotate the class with @Service Annotation */
public class MovieServiceImpl implements MovieService {

    MovieRepository movieRepository;

    /*
     * Constructor based Autowiring should be implemented
     */


    /*
     * This is method is used to get all the Movies
     */
    @Override
    public List<Movie> getAll() {

    }



    /*
     * This method is used to get a Movie by id.
     * The method should throw MovieNotFoundException, if the movie with the given id
     * is not found
     */
    @Override
    public Movie getById(int id) throws MovieNotFoundException {

    }


    /*
     * This method is used to save a new Movie.
     * The method should throw MovieAlreadyExistException, if the new movie that we are
     * trying save is already saved
     */
    @Override
    public Movie addNew(Movie emp) throws MovieAlreadyExistException {

    }
}
