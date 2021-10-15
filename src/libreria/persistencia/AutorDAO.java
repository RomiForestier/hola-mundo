/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package libreria.persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.Autor;

/**
 * 
 * @author Federico Fernandez Lafi <ffernandezlafi at gmail.com>
 */
public class AutorDAO {
    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
    private final EntityManager em = emf.createEntityManager();
    
    public void guardarAutor(Autor autor) throws Exception { // Este metodo es para ingresar 
        try {
            em.getTransaction().begin();            
            em.persist(autor); // Para guardar - envio el objeto completo
            em.getTransaction().commit();            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }



    public void modificarAutor  (Autor autor) throws Exception { // Este metodo es para ingresar o modificar
        try {            
            em.getTransaction().begin();
            em.merge(autor);            
            em.getTransaction().commit();            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void eliminarAutor (String id) throws Exception {
        try {            
            
            Autor autor = buscarAutorPorId(id);
            em.getTransaction().begin();            
            em.remove(autor);
            em.getTransaction().commit();            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Autor buscarAutorPorId(String id) throws Exception {
        try {
            Autor autor = em.find(Autor.class, id);            
            return autor;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    } 
}
