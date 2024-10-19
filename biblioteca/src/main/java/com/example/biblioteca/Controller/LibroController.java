package com.example.biblioteca.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.biblioteca.Model.Libros;
import com.example.biblioteca.Service.LibroService;

@RestController
@RequestMapping("/libros")
public class LibroController {

    @Autowired
    private LibroService libroService;

    //mostrar todo el listado
    @GetMapping
    public List<Libros> getAllLibros(){
        return libroService.getAllLibros();
    }

    //buscar por id
    @GetMapping("/{id}")
    public Optional<Libros>getLibrosById(@PathVariable Long id){
        return libroService.getLibrosById(id);
    }


    //crear nuevo
    @PostMapping
    public Libros createLibro(@RequestBody Libros libros){
        return libroService.createLibro(libros);
    }


    //actualizar
    @PutMapping("/{id}")
    public Libros updateLibro(@PathVariable Long id, @RequestBody Libros libros){
         return libroService.updateLibro(id, libros);
    }


    //eliminar
    @DeleteMapping("/{id}")
    public void deleteLibro(@PathVariable Long id){
        libroService.deleteLibro(id);
    }
    
}
