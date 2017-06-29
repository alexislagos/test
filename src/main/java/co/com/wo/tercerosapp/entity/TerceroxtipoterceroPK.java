/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.wo.tercerosapp.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author jhonl
 */
@Embeddable
public class TerceroxtipoterceroPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "idTipoTercero")
    private int idTipoTercero;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idTercero")
    private int idTercero;

    public TerceroxtipoterceroPK() {
    }

    public TerceroxtipoterceroPK(int idTipoTercero, int idTercero) {
        this.idTipoTercero = idTipoTercero;
        this.idTercero = idTercero;
    }

    public int getIdTipoTercero() {
        return idTipoTercero;
    }

    public void setIdTipoTercero(int idTipoTercero) {
        this.idTipoTercero = idTipoTercero;
    }

    public int getIdTercero() {
        return idTercero;
    }

    public void setIdTercero(int idTercero) {
        this.idTercero = idTercero;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idTipoTercero;
        hash += (int) idTercero;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TerceroxtipoterceroPK)) {
            return false;
        }
        TerceroxtipoterceroPK other = (TerceroxtipoterceroPK) object;
        if (this.idTipoTercero != other.idTipoTercero) {
            return false;
        }
        if (this.idTercero != other.idTercero) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.wo.tercerosapp.entity.TerceroxtipoterceroPK[ idTipoTercero=" + idTipoTercero + ", idTercero=" + idTercero + " ]";
    }
    
}
