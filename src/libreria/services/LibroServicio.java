/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package libreria.services;

import libreria.Autor;
import libreria.Editorial;
import libreria.Libro;
import libreria.persistencia.LibroDAO;

/**
 * 
 * @author Federico Fernandez Lafi <ffernandezlafi at gmail.com>
 */
public class LibroServicio {
    private LibroDAO dao;
    Libro x = new Libro();
    EditorialServicio eds = new EditorialServicio();
    AutorServicio as = new AutorServicio();
    
    public void Crearlibro (Long isbn, String titulo, Integer anio, Integer ejemplares, Integer ejemplaresPrestados, Integer ejemplaresRestantes, Boolean alta, Autor autor, Editorial editorial) throws Exception {
    try {
    x.setIsbn(isbn);
    x.setAnio(anio);
    x.setEjemplares(ejemplares);
    x.setEjemplaresPrestados(ejemplaresPrestados);
    x.setEjemplaresRestantes(ejemplaresRestantes);
    x.setTitulo(titulo);
    x.setAlta(true);
    System.out.println(x.toString());
    x.setAutor(autor);
    x.setEditorial(editorial);
    
   
    } catch (Exception e) {
        throw new Exception ("Error al Crear el Libro");
    } finally {
        dao.guardarLibro(x);
    }
}   
}
