package ec.edu.espe.marca.seguridad.model;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;

@Entity
@Table(name = "SEGURIDAD_PROCESADOR")
public class SeguridadProcesador implements Serializable {

    @Id
    @Column(name = "COD_PROCESADOR", length = 4, nullable = false)
    private Integer codProcesador;
    @Column(name = "CLAVE", length = 128, nullable = false)
    private String clave;
    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_ACTUALIZACION", nullable = false)
    private Date fechaActualizacion;
    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_ACTIVACION", nullable = false)
    private Date fechaActivacion;
    @Column(name = "ESTADO", length = 3, nullable = false)
    private String estado;

    public SeguridadProcesador() {
    }

    public SeguridadProcesador(Integer codProcesador) {
        this.codProcesador = codProcesador;
    }

    public Integer getCodProcesador() {
        return codProcesador;
    }

    public void setCodProcesador(Integer codProcesador) {
        this.codProcesador = codProcesador;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public Date getFechaActivacion() {
        return fechaActivacion;
    }

    public void setFechaActivacion(Date fechaActivacion) {
        this.fechaActivacion = fechaActivacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codProcesador == null) ? 0 : codProcesador.hashCode());
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
        SeguridadProcesador other = (SeguridadProcesador) obj;
        if (codProcesador == null) {
            if (other.codProcesador != null)
                return false;
        } else if (!codProcesador.equals(other.codProcesador))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "SeguridadProcesador [codProcesador=" + codProcesador + ", clave=" + clave + ", fechaActualizacion="
                + fechaActualizacion + ", fechaActivacion=" + fechaActivacion + ", estado=" + estado + "]";
    }

}