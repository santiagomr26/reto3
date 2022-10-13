package com.example.reto3.Repositorio;

import com.example.reto3.Interface.CategoryInterface;
import com.example.reto3.Modelo.Category;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository

public class CategoryRepository {
    @Autowired
    private CategoryInterface extensionesCrud;

    public List<Category> getAll(){
        return (List<Category>) extensionesCrud.findAll();
    }

    public Optional<Category> getCategory(int id){
        return extensionesCrud.findById(id);
    }

    public Category save (Category category){
        return extensionesCrud.save(category);
    }

    public void delete (Category category){
        extensionesCrud.delete(category);
    }



}