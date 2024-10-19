package com.example.biblioteca.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.biblioteca.Model.Libros;
import com.example.biblioteca.Service.LibroService;

@RestController
@RequestMapping("/libro")
public class LibroController {

    @Autowired
    private LibroService libroService;

    @GetMapping
    public List<Libros> getAllLibros(){
        return libroService.getAllLibros();
    }

    @GetMapping("/{id}")
    public Optional<Libros>getLibrosById(@PathVariable Long id){
        return libroService.getLibrosById(id);
    }
    
}
