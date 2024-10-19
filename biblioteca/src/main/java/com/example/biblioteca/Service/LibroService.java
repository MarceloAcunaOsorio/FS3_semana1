package com.example.biblioteca.Service;

import java.util.List;
import java.util.Optional;

import com.example.biblioteca.Model.Libros;

public interface LibroService {
    
    List<Libros> getAllLibros();
    Optional<Libros> getLibrosById(Long id);
    
}
