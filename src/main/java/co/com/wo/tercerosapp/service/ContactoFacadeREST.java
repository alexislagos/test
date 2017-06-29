/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.wo.tercerosapp.service;

import co.com.wo.tercerosapp.entity.Contacto;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Jhon Alexis Lagos
 */
@Stateless
@Path("contactos")
public class ContactoFacadeREST extends AbstractFacade<Contacto> {
    @PersistenceContext(unitName = "TercerosAppPersistence")
    private EntityManager em;

    public ContactoFacadeREST() {
        super(Contacto.class);
    }
    
    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Contacto find(@PathParam("id") Integer id) {
        return super.find(id);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Contacto> findAll(@QueryParam("tercero") String tercero) {
        if(tercero == null || tercero.trim().length() == 0)
            return super.findAll();
        else
            return getEntityManager().createNamedQuery("Contacto.findByIdTercero").setParameter("idTercero", Integer.parseInt(tercero)).getResultList();
    }
    
    @POST
    @Override
    @Consumes(MediaType.APPLICATION_JSON)
    public Contacto create(Contacto entity) {
        return super.create(entity);
    }

    @PUT
    @Override
    @Consumes(MediaType.APPLICATION_JSON)
    public void edit(Contacto entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        super.remove(super.find(id));
    }
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
}