package com.example.reto3.Repositorio;

import com.example.reto3.Interface.MessageInterface;
import com.example.reto3.Modelo.Message;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository

public class MessageRepository {
    @Autowired
    private MessageInterface extensionesCrud;

    public List<Message> getAll(){
        return (List<Message>) extensionesCrud.findAll();
    }

    public Optional<Message> getMessage(int id){
        return extensionesCrud.findById(id);
    }

    public Message save (Message message){
        return extensionesCrud.save(message);
    }

    public void delete(Message message){
        extensionesCrud.delete(message);
    }

}


