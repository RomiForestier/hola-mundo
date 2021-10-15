/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package libreria.persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.Libro;

/**
 * 
 * @author Federico Fernandez Lafi <ffernandezlafi at gmail.com>
 */
public class LibroDAO {
    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
    private final EntityManager em = emf.createEntityManager();

    public void guardarLibro(Libro libro) throws Exception { // Este metodo es para ingresar 
        try {
            em.getTransaction().begin();
            em.persist(libro); // Para guardar - envio el objeto completo
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void modificarLibro(Libro libro) throws Exception { // Este metodo es para ingresar o modificar
        try {
            em.getTransaction().begin();
            em.merge(libro);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void eliminarLibro(String id) throws Exception {
        try {

            Libro libro = buscarLibroPorId(id);
            em.getTransaction().begin();
            em.remove(libro);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Libro buscarLibroPorId(String id) throws Exception {
        try {
            Libro libro = em.find(Libro.class, id);
            return libro;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
