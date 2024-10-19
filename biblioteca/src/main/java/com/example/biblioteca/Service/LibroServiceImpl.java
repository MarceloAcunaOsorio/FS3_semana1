package com.example.biblioteca.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.biblioteca.Model.Libros;
import com.example.biblioteca.Repository.LibroRepository;

@Service
public class LibroServiceImpl implements LibroService {

    @Autowired
    private LibroRepository libroRepository;


    @Override
    public List<Libros> getAllLibros(){
        return libroRepository.findAll();
    }

    @Override
    public Optional<Libros> getLibrosById(Long id){
        return libroRepository.findById(id);
    }
    

    //crear libro
    @Override
    public Libros createLibro(Libros libros){
        return libroRepository.save(libros);
    }



    //Actualizar Libro
    @Override
    public Libros updateLibro(Long id, Libros libros){
        if(libroRepository.existsById(id))
        {
          libros.set_id(id);
          return libroRepository.save(libros);
        }
        else
        {
            return null;
        }
    }



    //Eliminar
    @Override
    public void deleteLibro(Long id){
        libroRepository.deleteById(id);
    }
    
}
