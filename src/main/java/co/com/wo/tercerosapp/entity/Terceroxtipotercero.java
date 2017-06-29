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
@Table(name = "terceroxtipotercero")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Terceroxtipotercero.findAll", query = "SELECT t FROM Terceroxtipotercero t")
    , @NamedQuery(name = "Terceroxtipotercero.findByIdTipoTercero", query = "SELECT t FROM Terceroxtipotercero t WHERE t.terceroxtipoterceroPK.idTipoTercero = :idTipoTercero")
    , @NamedQuery(name = "Terceroxtipotercero.findByIdTercero", query = "SELECT t FROM Terceroxtipotercero t WHERE t.terceroxtipoterceroPK.idTercero = :idTercero")})
public class Terceroxtipotercero implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TerceroxtipoterceroPK terceroxtipoterceroPK;

    public Terceroxtipotercero() {
    }

    public Terceroxtipotercero(TerceroxtipoterceroPK terceroxtipoterceroPK) {
        this.terceroxtipoterceroPK = terceroxtipoterceroPK;
    }

    public Terceroxtipotercero(int idTipoTercero, int idTercero) {
        this.terceroxtipoterceroPK = new TerceroxtipoterceroPK(idTipoTercero, idTercero);
    }

    public TerceroxtipoterceroPK getTerceroxtipoterceroPK() {
        return terceroxtipoterceroPK;
    }

    public void setTerceroxtipoterceroPK(TerceroxtipoterceroPK terceroxtipoterceroPK) {
        this.terceroxtipoterceroPK = terceroxtipoterceroPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (terceroxtipoterceroPK != null ? terceroxtipoterceroPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Terceroxtipotercero)) {
            return false;
        }
        Terceroxtipotercero other = (Terceroxtipotercero) object;
        if ((this.terceroxtipoterceroPK == null && other.terceroxtipoterceroPK != null) || (this.terceroxtipoterceroPK != null && !this.terceroxtipoterceroPK.equals(other.terceroxtipoterceroPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.wo.tercerosapp.entity.Terceroxtipotercero[ terceroxtipoterceroPK=" + terceroxtipoterceroPK + " ]";
    }
    
}
