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
@Table(name = "direccionestercero")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Direccionestercero.findAll", query = "SELECT d FROM Direccionestercero d")
    , @NamedQuery(name = "Direccionestercero.findByIdDireccion", query = "SELECT d FROM Direccionestercero d WHERE d.idDireccion = :idDireccion")
    , @NamedQuery(name = "Direccionestercero.findByDireccion", query = "SELECT d FROM Direccionestercero d WHERE d.direccion = :direccion")
    , @NamedQuery(name = "Direccionestercero.findBySucursal", query = "SELECT d FROM Direccionestercero d WHERE d.sucursal = :sucursal")
    , @NamedQuery(name = "Direccionestercero.findByTelefono", query = "SELECT d FROM Direccionestercero d WHERE d.telefono = :telefono")
    , @NamedQuery(name = "Direccionestercero.findByPaginaWeb", query = "SELECT d FROM Direccionestercero d WHERE d.paginaWeb = :paginaWeb")
    , @NamedQuery(name = "Direccionestercero.findByIdCiudad", query = "SELECT d FROM Direccionestercero d WHERE d.idCiudad = :idCiudad")
    , @NamedQuery(name = "Direccionestercero.findByIdTercero", query = "SELECT d FROM Direccionestercero d WHERE d.idTercero = :idTercero")})
public class Direccionestercero implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idDireccion")
    private Integer idDireccion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 59)
    @Column(name = "direccion")
    private String direccion;
    @Size(max = 50)
    @Column(name = "sucursal")
    private String sucursal;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "telefono")
    private String telefono;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "paginaWeb")
    private String paginaWeb;
    @Column(name = "idCiudad")
    private Integer idCiudad;
    @Column(name = "idTercero")
    private Integer idTercero;

    public Direccionestercero() {
    }

    public Direccionestercero(Integer idDireccion) {
        this.idDireccion = idDireccion;
    }

    public Direccionestercero(Integer idDireccion, String direccion, String telefono, String paginaWeb) {
        this.idDireccion = idDireccion;
        this.direccion = direccion;
        this.telefono = telefono;
        this.paginaWeb = paginaWeb;
    }

    public Integer getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(Integer idDireccion) {
        this.idDireccion = idDireccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }

    public Integer getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(Integer idCiudad) {
        this.idCiudad = idCiudad;
    }

    public Integer getIdTercero() {
        return idTercero;
    }

    public void setIdTercero(Integer idTercero) {
        this.idTercero = idTercero;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDireccion != null ? idDireccion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Direccionestercero)) {
            return false;
        }
        Direccionestercero other = (Direccionestercero) object;
        if ((this.idDireccion == null && other.idDireccion != null) || (this.idDireccion != null && !this.idDireccion.equals(other.idDireccion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.wo.tercerosapp.entity.Direccionestercero[ idDireccion=" + idDireccion + " ]";
    }
    
}
