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
@Table(name = "tipocontribuyente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipocontribuyente.findAll", query = "SELECT t FROM Tipocontribuyente t")
    , @NamedQuery(name = "Tipocontribuyente.findByIdTipoContribuyente", query = "SELECT t FROM Tipocontribuyente t WHERE t.idTipoContribuyente = :idTipoContribuyente")
    , @NamedQuery(name = "Tipocontribuyente.findByTipoContribuyente", query = "SELECT t FROM Tipocontribuyente t WHERE t.tipoContribuyente = :tipoContribuyente")})
public class Tipocontribuyente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idTipoContribuyente")
    private Integer idTipoContribuyente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "tipoContribuyente")
    private String tipoContribuyente;

    public Tipocontribuyente() {
    }

    public Tipocontribuyente(Integer idTipoContribuyente) {
        this.idTipoContribuyente = idTipoContribuyente;
    }

    public Tipocontribuyente(Integer idTipoContribuyente, String tipoContribuyente) {
        this.idTipoContribuyente = idTipoContribuyente;
        this.tipoContribuyente = tipoContribuyente;
    }

    public Integer getIdTipoContribuyente() {
        return idTipoContribuyente;
    }

    public void setIdTipoContribuyente(Integer idTipoContribuyente) {
        this.idTipoContribuyente = idTipoContribuyente;
    }

    public String getTipoContribuyente() {
        return tipoContribuyente;
    }

    public void setTipoContribuyente(String tipoContribuyente) {
        this.tipoContribuyente = tipoContribuyente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoContribuyente != null ? idTipoContribuyente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipocontribuyente)) {
            return false;
        }
        Tipocontribuyente other = (Tipocontribuyente) object;
        if ((this.idTipoContribuyente == null && other.idTipoContribuyente != null) || (this.idTipoContribuyente != null && !this.idTipoContribuyente.equals(other.idTipoContribuyente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.wo.tercerosapp.entity.Tipocontribuyente[ idTipoContribuyente=" + idTipoContribuyente + " ]";
    }
    
}
