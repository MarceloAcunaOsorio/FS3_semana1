package com.example.biblioteca.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Libro")
public class Libros {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Long _id;

    @Column(name = "titulo")
    private String _titulo;

    @Column(name = "autor")
    private String _autor;

    @Column(name = "añoPublicacion")
    private int _añoPublicacion;

    @Column(name = "genero")
    private String _genero;
    
    

    //Getter y Setter

    public Long get_id() {
        return _id;
    }
    public void set_id(Long _id) {
        this._id = _id;
    }
    public String get_titulo() {
        return _titulo;
    }
    public void set_titulo(String _titulo) {
        this._titulo = _titulo;
    }
    public String get_autor() {
        return _autor;
    }
    public void set_autor(String _autor) {
        this._autor = _autor;
    }
    public int get_añoPublicacion() {
        return _añoPublicacion;
    }
    public void set_añoPublicacion(int _añoPublicacion) {
        this._añoPublicacion = _añoPublicacion;
    }
    public String get_genero() {
        return _genero;
    }
    public void set_genero(String _genero) {
        this._genero = _genero;
    }
    
}
