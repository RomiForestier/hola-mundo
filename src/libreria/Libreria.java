/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;


import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.persistencia.AutorDAO;
import libreria.services.AutorServicio;
import libreria.services.EditorialServicio;
import libreria.services.LibroServicio;

/**
 *
 * @author Federico Fernandez Lafi <ffernandezlafi at gmail.com>
 */
public class Libreria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
   
        AutorServicio aus = new AutorServicio();
        LibroServicio lis = new LibroServicio();
        EditorialServicio eds = new EditorialServicio();
        AutorDAO dao;
       
            try {
                //
//        try {
//            aus.crearAutor("dasda");
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
//        try {
//            aus.crearAutor("QWEQDSAD");
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
//
            Autor autor = aus.crearAutor("fede");
//        
//        } catch (Exception ex) {
//            Logger.getLogger(Libreria.class.getName()).log(Level.SEVERE, null, ex);
//        }
//            try {
//            lis.Crearlibro(19587l, "Harry Potter", 1999, 4, 2, 2, true, autor, eds.crearEditorial("HP"));
//            } catch (Exception ex) {
//            System.out.println(ex.getMessage()); 
//        }
//    }
            } catch (Exception ex) {
                Logger.getLogger(Libreria.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
}
    

