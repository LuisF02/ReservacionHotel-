/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.LuisGarcia.sessionsbeans;

import com.LuisGarcia.entities.Registrohuespedes;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author programacion
 */
@Stateless
public class RegistrohuespedesFacade extends AbstractFacade<Registrohuespedes> implements RegistrohuespedesFacadeLocal {

    @PersistenceContext(unitName = "ReservacionHotel-2014188")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RegistrohuespedesFacade() {
        super(Registrohuespedes.class);
    }
    
}
