/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package libreria.services;


import libreria.Autor;
import libreria.persistencia.AutorDAO;

/**
 * 
 * @author Federico Fernandez Lafi <ffernandezlafi at gmail.com>
 */
public class AutorServicio {
    private AutorDAO dao;
    Autor x = new Autor();
    
    public Autor crearAutor (String nombreA ) throws Exception {
        try {
           
            x.setNombre(nombreA);
            if (nombreA == null || nombreA.trim().isEmpty())
            {
                throw new Exception("Debe indicar el nombre del autor");
            }
            x.setAlta(true);            
            dao.guardarAutor(x);
            System.out.println(x.toString());
            return x;
            
        } catch (Exception ex) {
          ex.printStackTrace();
          throw new Exception (ex.toString());
            
        } 
    }
   
}

