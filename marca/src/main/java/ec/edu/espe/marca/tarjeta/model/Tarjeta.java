package ec.edu.espe.marca.tarjeta.model;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;

@Entity
@Table(name = "TARJETA")
public class Tarjeta implements Serializable {
    @Id
    @Column(name = "COD_TARJETA", length = 10, nullable = false)
    private Integer codTarjeta;
    @Column(name = "COD_BANCO_EMISOR")
    private Integer codBancoEmisor;
    @Column(name = "CLIENTE")
    private Integer cliente;
    @Column(name = "NUMERO_TARJETA")
    private Integer numeroTarjeta;
    @Column(name = "CVV", length = 4, nullable = false)
    private String cvv;
    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_EXPIRACION", nullable = false)
    private Date fechaExpiracion;
    @Column(name = "TIPO_TARJETA", length = 32, nullable = false)
    private String tipoTarjeta;

    /* Falta Relacion */

    public Tarjeta() {
    }

    public Tarjeta(Integer codTarjeta) {
        this.codTarjeta = codTarjeta;
    }

    public Integer getCodTarjeta() {
        return codTarjeta;
    }

    public void setCodTarjeta(Integer codTarjeta) {
        this.codTarjeta = codTarjeta;
    }

    public Integer getCodBancoEmisor() {
        return codBancoEmisor;
    }

    public void setCodBancoEmisor(Integer codBancoEmisor) {
        this.codBancoEmisor = codBancoEmisor;
    }

    public Integer getCliente() {
        return cliente;
    }

    public void setCliente(Integer cliente) {
        this.cliente = cliente;
    }

    public Integer getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(Integer numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public Date getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(Date fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codTarjeta == null) ? 0 : codTarjeta.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Tarjeta other = (Tarjeta) obj;
        if (codTarjeta == null) {
            if (other.codTarjeta != null)
                return false;
        } else if (!codTarjeta.equals(other.codTarjeta))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Tarjeta [codTarjeta=" + codTarjeta + ", codBancoEmisor=" + codBancoEmisor + ", cliente=" + cliente
                + ", numeroTarjeta=" + numeroTarjeta + ", cvv=" + cvv + ", fechaExpiracion=" + fechaExpiracion
                + ", tipoTarjeta=" + tipoTarjeta + "]";
    }
}
