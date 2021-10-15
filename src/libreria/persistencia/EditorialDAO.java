/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package libreria.persistencia;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.Editorial;

/**
 * 
 * @author Federico Fernandez Lafi <ffernandezlafi at gmail.com>
 */
public class EditorialDAO {
    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
    private final EntityManager em = emf.createEntityManager();
    
    public void guardarEditorial(Editorial editorial) throws Exception { // Este metodo es para ingresar 
        try {
            em.getTransaction().begin();            
            em.persist(editorial); // Para guardar - envio el objeto completo
            em.getTransaction().commit();            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
//

    public void modificarEditorial(Editorial editorial) throws Exception { // Este metodo es para ingresar o modificar
        try {            
            em.getTransaction().begin();
            em.merge(editorial);            
            em.getTransaction().commit();            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void eliminarEditorial(String id) throws Exception {
        try {            
            
            Editorial editorial = buscarEditorialPorId(id);
            em.getTransaction().begin();            
            em.remove(editorial);
            em.getTransaction().commit();            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Editorial buscarEditorialPorId(String id) throws Exception {
        try {
            Editorial editorial = em.find(Editorial.class, id);            
            return editorial;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
