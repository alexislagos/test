/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.wo.tercerosapp.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jhonl
 */
@Entity
@Table(name = "tipotercero")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipotercero.findAll", query = "SELECT t FROM Tipotercero t")
    , @NamedQuery(name = "Tipotercero.findByIdTipoTercero", query = "SELECT t FROM Tipotercero t WHERE t.idTipoTercero = :idTipoTercero")
    , @NamedQuery(name = "Tipotercero.findByTipoTercero", query = "SELECT t FROM Tipotercero t WHERE t.tipoTercero = :tipoTercero")})
public class Tipotercero implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idTipoTercero")
    private Integer idTipoTercero;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "tipoTercero")
    private String tipoTercero;

    public Tipotercero() {
    }

    public Tipotercero(Integer idTipoTercero) {
        this.idTipoTercero = idTipoTercero;
    }

    public Tipotercero(Integer idTipoTercero, String tipoTercero) {
        this.idTipoTercero = idTipoTercero;
        this.tipoTercero = tipoTercero;
    }

    public Integer getIdTipoTercero() {
        return idTipoTercero;
    }

    public void setIdTipoTercero(Integer idTipoTercero) {
        this.idTipoTercero = idTipoTercero;
    }

    public String getTipoTercero() {
        return tipoTercero;
    }

    public void setTipoTercero(String tipoTercero) {
        this.tipoTercero = tipoTercero;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoTercero != null ? idTipoTercero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipotercero)) {
            return false;
        }
        Tipotercero other = (Tipotercero) object;
        if ((this.idTipoTercero == null && other.idTipoTercero != null) || (this.idTipoTercero != null && !this.idTipoTercero.equals(other.idTipoTercero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.wo.tercerosapp.entity.Tipotercero[ idTipoTercero=" + idTipoTercero + " ]";
    }
    
}
