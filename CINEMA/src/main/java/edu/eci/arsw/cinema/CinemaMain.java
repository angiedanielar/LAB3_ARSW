package edu.eci.arsw.cinema;

import edu.eci.arsw.cinema.model.Cinema;
import edu.eci.arsw.cinema.model.CinemaFunction;
import edu.eci.arsw.cinema.model.Movie;
import edu.eci.arsw.cinema.persistence.CinemaException;
import edu.eci.arsw.cinema.services.CinemaServices;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

public class CinemaMain {

    public static void main(String[] args) throws CinemaException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        CinemaServices cinemaServices = applicationContext.getBean(CinemaServices.class);
        //Register a new cinema
        Cinema cinema = registerCinema("CineARSW"); 
        cinemaServices.addNewCinema(cinema);
        System.out.println("-----WELCOME TO THE CINEMA SYSTEM-----");
        //Consulting cinemas
        System.out.println("Consulting all cinemas");
        System.out.println(cinemaServices.getAllCinemas());                      
        //Buying tickets
        for (int i = 2; i < 5; i++) {
            cinemaServices.buyTicket(1, i, "CineARSW", "2018-07-15 12:00", "Inception");
        }
        //Consulting a cinema
        System.out.println("Consulting cinemaX");
        System.out.println(cinemaServices.getFunctionsbyCinemaAndDate("cinemaX", "2018-12-18 15:30"));
    }

    private static Cinema registerCinema(String name) {
        Movie movie1 = new Movie("Inception", "Suspense");        
        ArrayList<CinemaFunction> functions = new ArrayList<>();        
        CinemaFunction cf = new CinemaFunction(movie1, "2018-07-15 12:00");        
        functions.add(cf);        
        return new Cinema(name, functions);
    }
}