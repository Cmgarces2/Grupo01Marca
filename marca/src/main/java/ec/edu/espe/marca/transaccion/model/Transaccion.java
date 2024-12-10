package ec.edu.espe.marca.model;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;
import java.math.BigDecimal;

@Entity
@Table(name = "TRANSACCION")
public class Transaccion implements Serializable {
    @Id
    @Column(name = "COD_TRANSACCION", length = 10, nullable = false)
    private Integer codTransaccion;
    @Column(name = "COD_TARJETA", length = 10, nullable = false)
    private Integer codTarjeta;
    @Column(name = "COD_LIQUIDACION", length = 10, nullable = false)
    private Integer codLiquidacion;
    @Column(name = "COD_PROCESADOR", length = 10, nullable = false)
    private Integer codProcesador;
    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_TRANSACCION", nullable = false)
    private Date fechaTransaccion;
    @Column(name = "MONTO", precision = 18, scale = 2, nullable = false)
    private BigDecimal monto;
    @Column(name = "ESTADO", length = 3, nullable = false)
    private String estado;
    @Column(name = "INTENTOS_VALIDACION", nullable = true)
    private Integer intentosValidacion;
    @Column(name = "CODIGO_AUTORIZACION", length = 10, nullable = false)
    private String codigoAutorizacion;
    @Column(name = "TIPO_TRANSACCION", length = 20, nullable = false)
    private String tipoTransaccion;
    @Column(name = "MONEDA", length = 3, nullable = false)
    private String moneda;
    @Column(name = "PAIS_ORIGEN", length = 3, nullable = false)
    private String paisOrigen;
    @Column(name = "CODIGO_RESPUESTA", length = 3, nullable = false)
    private String codigoRespuesta;
    @Column(name = "COMISION_MARCA", precision = 18, scale = 2, nullable = true)
    private BigDecimal comisionMarca;
    @Column(name = "CANAL", length = 20, nullable = false)
    private String canal;

    /* Falta Relacion */

    public Transaccion() {
    }

    public Transaccion(Integer codTransaccion) {
        this.codTransaccion = codTransaccion;
    }

    public Integer getCodTransaccion() {
        return codTransaccion;
    }

    public void setCodTransaccion(Integer codTransaccion) {
        this.codTransaccion = codTransaccion;
    }

    public Integer getCodTarjeta() {
        return codTarjeta;
    }

    public void setCodTarjeta(Integer codTarjeta) {
        this.codTarjeta = codTarjeta;
    }

    public Integer getCodLiquidacion() {
        return codLiquidacion;
    }

    public void setCodLiquidacion(Integer codLiquidacion) {
        this.codLiquidacion = codLiquidacion;
    }

    public Integer getCodProcesador() {
        return codProcesador;
    }

    public void setCodProcesador(Integer codProcesador) {
        this.codProcesador = codProcesador;
    }

    public Date getFechaTransaccion() {
        return fechaTransaccion;
    }

    public void setFechaTransaccion(Date fechaTransaccion) {
        this.fechaTransaccion = fechaTransaccion;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getIntentosValidacion() {
        return intentosValidacion;
    }

    public void setIntentosValidacion(Integer intentosValidacion) {
        this.intentosValidacion = intentosValidacion;
    }

    public String getCodigoAutorizacion() {
        return codigoAutorizacion;
    }

    public void setCodigoAutorizacion(String codigoAutorizacion) {
        this.codigoAutorizacion = codigoAutorizacion;
    }

    public String getTipoTransaccion() {
        return tipoTransaccion;
    }

    public void setTipoTransaccion(String tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public String getCodigoRespuesta() {
        return codigoRespuesta;
    }

    public void setCodigoRespuesta(String codigoRespuesta) {
        this.codigoRespuesta = codigoRespuesta;
    }

    public BigDecimal getComisionMarca() {
        return comisionMarca;
    }

    public void setComisionMarca(BigDecimal comisionMarca) {
        this.comisionMarca = comisionMarca;
    }

    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codTransaccion == null) ? 0 : codTransaccion.hashCode());
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
        Transaccion other = (Transaccion) obj;
        if (codTransaccion == null) {
            if (other.codTransaccion != null)
                return false;
        } else if (!codTransaccion.equals(other.codTransaccion))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Transaccion [codTransaccion=" + codTransaccion + ", codTarjeta=" + codTarjeta + ", codLiquidacion="
                + codLiquidacion + ", codProcesador=" + codProcesador + ", fechaTransaccion=" + fechaTransaccion
                + ", monto=" + monto + ", estado=" + estado + ", intentosValidacion=" + intentosValidacion
                + ", codigoAutorizacion=" + codigoAutorizacion + ", tipoTransaccion=" + tipoTransaccion + ", moneda="
                + moneda + ", paisOrigen=" + paisOrigen + ", codigoRespuesta=" + codigoRespuesta + ", comisionMarca="
                + comisionMarca + ", canal=" + canal + "]";
    }

}
