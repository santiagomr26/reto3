package com.example.reto3.Repositorio;

import com.example.reto3.Interface.ReservationInterface;
import com.example.reto3.Modelo.Reservation;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository

public class ReservationRepository {
    @Autowired
    private ReservationInterface extensionesCrud;

    public List<Reservation> getAll(){
        return (List<Reservation>) extensionesCrud.findAll();
    }

    public Optional<Reservation> getReservation(int id){
        return extensionesCrud.findById(id);
    }

    public Reservation save (Reservation reservation){
        return extensionesCrud.save(reservation);
    }

    public void delete(Reservation reservation){
        extensionesCrud.delete(reservation);
    }
}