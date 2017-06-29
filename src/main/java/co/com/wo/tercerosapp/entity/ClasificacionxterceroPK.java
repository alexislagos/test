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
public class ClasificacionxterceroPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "idTercero")
    private int idTercero;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idClasificacion")
    private int idClasificacion;

    public ClasificacionxterceroPK() {
    }

    public ClasificacionxterceroPK(int idTercero, int idClasificacion) {
        this.idTercero = idTercero;
        this.idClasificacion = idClasificacion;
    }

    public int getIdTercero() {
        return idTercero;
    }

    public void setIdTercero(int idTercero) {
        this.idTercero = idTercero;
    }

    public int getIdClasificacion() {
        return idClasificacion;
    }

    public void setIdClasificacion(int idClasificacion) {
        this.idClasificacion = idClasificacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idTercero;
        hash += (int) idClasificacion;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClasificacionxterceroPK)) {
            return false;
        }
        ClasificacionxterceroPK other = (ClasificacionxterceroPK) object;
        if (this.idTercero != other.idTercero) {
            return false;
        }
        if (this.idClasificacion != other.idClasificacion) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.wo.tercerosapp.entity.ClasificacionxterceroPK[ idTercero=" + idTercero + ", idClasificacion=" + idClasificacion + " ]";
    }
    
}
