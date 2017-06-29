/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.wo.tercerosapp.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jhonl
 */
@Entity
@Table(name = "tercero")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tercero.findAll", query = "SELECT t FROM Tercero t")
    , @NamedQuery(name = "Tercero.findByIdTercero", query = "SELECT t FROM Tercero t WHERE t.idTercero = :idTercero")
    , @NamedQuery(name = "Tercero.findByIdTipo", query = "SELECT t FROM Tercero t WHERE t.idTipo = :idTipo")
    , @NamedQuery(name = "Tercero.findByIdentificacion", query = "SELECT t FROM Tercero t WHERE t.identificacion = :identificacion")
    , @NamedQuery(name = "Tercero.findByPrimerNombre", query = "SELECT t FROM Tercero t WHERE t.primerNombre = :primerNombre")
    , @NamedQuery(name = "Tercero.findBySegundoNombre", query = "SELECT t FROM Tercero t WHERE t.segundoNombre = :segundoNombre")
    , @NamedQuery(name = "Tercero.findByPrimerAprellido", query = "SELECT t FROM Tercero t WHERE t.primerAprellido = :primerAprellido")
    , @NamedQuery(name = "Tercero.findBySegundoApellido", query = "SELECT t FROM Tercero t WHERE t.segundoApellido = :segundoApellido")
    , @NamedQuery(name = "Tercero.findByCodigo", query = "SELECT t FROM Tercero t WHERE t.codigo = :codigo")
    , @NamedQuery(name = "Tercero.findByObservacion", query = "SELECT t FROM Tercero t WHERE t.observacion = :observacion")
    , @NamedQuery(name = "Tercero.findByActivo", query = "SELECT t FROM Tercero t WHERE t.activo = :activo")
    , @NamedQuery(name = "Tercero.findByFechaCreacion", query = "SELECT t FROM Tercero t WHERE t.fechaCreacion = :fechaCreacion")
    , @NamedQuery(name = "Tercero.findByImagen", query = "SELECT t FROM Tercero t WHERE t.imagen = :imagen")
    , @NamedQuery(name = "Tercero.findByDescuento", query = "SELECT t FROM Tercero t WHERE t.descuento = :descuento")
    , @NamedQuery(name = "Tercero.findByPlazo", query = "SELECT t FROM Tercero t WHERE t.plazo = :plazo")
    , @NamedQuery(name = "Tercero.findByIdTipoContribuyente", query = "SELECT t FROM Tercero t WHERE t.idTipoContribuyente = :idTipoContribuyente")
    , @NamedQuery(name = "Tercero.findByIdCiudad", query = "SELECT t FROM Tercero t WHERE t.idCiudad = :idCiudad")})
public class Tercero implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idTercero")
    private Integer idTercero;
    @Column(name = "idTipo")
    private Integer idTipo;
    @Size(max = 20)
    @Column(name = "identificacion")
    private String identificacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "primerNombre")
    private String primerNombre;
    @Size(max = 50)
    @Column(name = "segundoNombre")
    private String segundoNombre;
    @Size(max = 50)
    @Column(name = "primerAprellido")
    private String primerAprellido;
    @Size(max = 50)
    @Column(name = "segundoApellido")
    private String segundoApellido;
    @Size(max = 10)
    @Column(name = "codigo")
    private String codigo;
    @Size(max = 255)
    @Column(name = "observacion")
    private String observacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "activo")
    private boolean activo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;
    @Size(max = 50)
    @Column(name = "imagen")
    private String imagen;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "descuento")
    private Float descuento;
    @Column(name = "plazo")
    private Integer plazo;
    @Column(name = "idTipoContribuyente")
    private Integer idTipoContribuyente;
    @Column(name = "idCiudad")
    private Integer idCiudad;

    public Tercero() {
    }

    public Tercero(Integer idTercero) {
        this.idTercero = idTercero;
    }

    public Tercero(Integer idTercero, String primerNombre, boolean activo, Date fechaCreacion) {
        this.idTercero = idTercero;
        this.primerNombre = primerNombre;
        this.activo = activo;
        this.fechaCreacion = fechaCreacion;
    }

    public Integer getIdTercero() {
        return idTercero;
    }

    public void setIdTercero(Integer idTercero) {
        this.idTercero = idTercero;
    }

    public Integer getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(Integer idTipo) {
        this.idTipo = idTipo;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerAprellido() {
        return primerAprellido;
    }

    public void setPrimerAprellido(String primerAprellido) {
        this.primerAprellido = primerAprellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public boolean getActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Float getDescuento() {
        return descuento;
    }

    public void setDescuento(Float descuento) {
        this.descuento = descuento;
    }

    public Integer getPlazo() {
        return plazo;
    }

    public void setPlazo(Integer plazo) {
        this.plazo = plazo;
    }

    public Integer getIdTipoContribuyente() {
        return idTipoContribuyente;
    }

    public void setIdTipoContribuyente(Integer idTipoContribuyente) {
        this.idTipoContribuyente = idTipoContribuyente;
    }

    public Integer getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(Integer idCiudad) {
        this.idCiudad = idCiudad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTercero != null ? idTercero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tercero)) {
            return false;
        }
        Tercero other = (Tercero) object;
        if ((this.idTercero == null && other.idTercero != null) || (this.idTercero != null && !this.idTercero.equals(other.idTercero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.wo.tercerosapp.entity.Tercero[ idTercero=" + idTercero + " ]";
    }
    
}
