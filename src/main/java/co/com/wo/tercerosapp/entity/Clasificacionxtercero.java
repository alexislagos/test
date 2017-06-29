/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.wo.tercerosapp.entity;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jhonl
 */
@Entity
@Table(name = "clasificacionxtercero")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Clasificacionxtercero.findAll", query = "SELECT c FROM Clasificacionxtercero c")
    , @NamedQuery(name = "Clasificacionxtercero.findByIdTercero", query = "SELECT c FROM Clasificacionxtercero c WHERE c.clasificacionxterceroPK.idTercero = :idTercero")
    , @NamedQuery(name = "Clasificacionxtercero.findByIdClasificacion", query = "SELECT c FROM Clasificacionxtercero c WHERE c.clasificacionxterceroPK.idClasificacion = :idClasificacion")})
public class Clasificacionxtercero implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ClasificacionxterceroPK clasificacionxterceroPK;

    public Clasificacionxtercero() {
    }

    public Clasificacionxtercero(ClasificacionxterceroPK clasificacionxterceroPK) {
        this.clasificacionxterceroPK = clasificacionxterceroPK;
    }

    public Clasificacionxtercero(int idTercero, int idClasificacion) {
        this.clasificacionxterceroPK = new ClasificacionxterceroPK(idTercero, idClasificacion);
    }

    public ClasificacionxterceroPK getClasificacionxterceroPK() {
        return clasificacionxterceroPK;
    }

    public void setClasificacionxterceroPK(ClasificacionxterceroPK clasificacionxterceroPK) {
        this.clasificacionxterceroPK = clasificacionxterceroPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (clasificacionxterceroPK != null ? clasificacionxterceroPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clasificacionxtercero)) {
            return false;
        }
        Clasificacionxtercero other = (Clasificacionxtercero) object;
        if ((this.clasificacionxterceroPK == null && other.clasificacionxterceroPK != null) || (this.clasificacionxterceroPK != null && !this.clasificacionxterceroPK.equals(other.clasificacionxterceroPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.wo.tercerosapp.entity.Clasificacionxtercero[ clasificacionxterceroPK=" + clasificacionxterceroPK + " ]";
    }
    
}
