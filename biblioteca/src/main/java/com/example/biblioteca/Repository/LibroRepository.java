package com.example.biblioteca.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.biblioteca.Model.Libros;

public interface  LibroRepository extends JpaRepository<Libros , Long> {
    
}
