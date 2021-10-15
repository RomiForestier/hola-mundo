/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.services;

import libreria.Editorial;
import libreria.persistencia.EditorialDAO;

/**
 *
 * @author Federico Fernandez Lafi <ffernandezlafi at gmail.com>
 */
public class EditorialServicio {

    private EditorialDAO dao;
    Editorial x = new Editorial();

    public Editorial crearEditorial(String nombreE) throws Exception {
        try {
           
            x.setNombre(nombreE);
            x.setAlta(true);   
            x.toString();
            return x;
        } catch (Exception ex) {
            throw new Exception("Error al crear la Editorial");
        } finally {
            dao.guardarEditorial(x);
        }
             
    }

}
