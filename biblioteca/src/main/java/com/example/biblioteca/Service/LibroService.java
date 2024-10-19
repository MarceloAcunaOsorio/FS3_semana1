package com.example.biblioteca.Service;

import java.util.List;
import java.util.Optional;

import com.example.biblioteca.Model.Libros;

public interface LibroService {
    
    List<Libros> getAllLibros();
    Optional<Libros> getLibrosById(Long id);


    //metodos para modificar, crear y eliminar

    Libros createLibro(Libros libros);
    Libros updateLibro(Long id, Libros libros);
    void deleteLibro(Long id);
    
}
