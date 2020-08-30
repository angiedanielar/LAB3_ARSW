/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.cinema.services;

import edu.eci.arsw.cinema.model.Cinema;
import edu.eci.arsw.cinema.model.CinemaFunction;
import edu.eci.arsw.cinema.persistence.CinemaException;
import edu.eci.arsw.cinema.persistence.CinemaPersistenceException;
import edu.eci.arsw.cinema.persistence.CinemaPersitence;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 *
 * @author cristian
 */

@Service("ServiciosCine")
public class CinemaServices {
    
    @Autowired
    @Qualifier("EnMemoria")
    CinemaPersitence cps = null;    
    
    /**
     * Añade un nuevo cinema
     * @param c Cinema
     * @throws edu.eci.arsw.cinema.persistence.CinemaException
     */
    public void addNewCinema(Cinema c) throws CinemaException{
        try {
            cps.saveCinema(c);
        } catch (CinemaPersistenceException ex) {
            throw new CinemaException(ex.getMessage(), ex);
        }
        
    }
    
    /**
     * Obtiene todos los cinemas      
     * @return Todos los cines
     */
    public Set<Cinema> getAllCinemas(){
        return cps.getCinemas();
    }
    
    /**
     * 
     * @param name cinema's name
     * @return the cinema of the given name created by the given author
     * @throws CinemaException
     */
    public Cinema getCinemaByName(String name) throws CinemaException{
        try { 
            return cps.getCinemaByName(name);
        } catch (CinemaPersistenceException ex) {
            throw new CinemaException(ex.getMessage(), ex);
        }
    }
    
    /**
     * 
     * @param row the row of the seat
     * @param col the column of the seat
     * @param cinema the cinema's name
     * @param date the date of the function
     * @param movieName the name of the movie
     * 
     * @throws CinemaException if the seat is occupied,
     *    or any other low-level persistence error occurs.
     */
    public void buyTicket(int row, int col, String cinema, String date, String movieName) throws CinemaException{
        try { 
            cps.buyTicket(row, col, cinema, date, movieName);
        } catch (CinemaPersistenceException ex) {
            throw new CinemaException(ex.getMessage(), ex);
        }
    }
    
    /**
     * 
     * @param cinema cinema's name
     * @param date date
     * @return the list of the functions of the cinema in the given date
     */
    public List<CinemaFunction> getFunctionsbyCinemaAndDate(String cinema, String date) throws CinemaException {
        try { 
            return cps.getFunctionsbyCinemaAndDate(cinema, date);
        } catch (CinemaPersistenceException ex) {
            throw new CinemaException(ex.getMessage(), ex);
        }
    }
    
    /**
     * Nos dimos cuenta que tambien debiamos implementar este servicio 
     * @param cinema new cinema
     * @throws  CinemaPersistenceException n if a cinema with the same name already exists
     */
    public void saveCinema(Cinema cinema) throws CinemaPersistenceException {
        cps.saveCinema(cinema);
    }


}
