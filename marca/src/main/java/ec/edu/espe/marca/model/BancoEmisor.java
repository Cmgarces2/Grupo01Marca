package ec.edu.espe.marca.model;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "BANCO_EMISOR")
public class BancoEmisor implements Serializable {

    @Id
    @Column(name = "COD_BANCO_EMISOR", length = 10, nullable = false)
    private Integer codBancoEmisor;
    @Column(name = "NOMBRE", length = 50, nullable = false)
    private String nombre;
    @Column(name = "PAIS", length = 3, nullable = false)
    private String pais;

    /* Falta Relacion */

    public BancoEmisor() {
    }

    public BancoEmisor(Integer codBancoEmisor) {
        this.codBancoEmisor = codBancoEmisor;
    }

    public Integer getCodBancoEmisor() {
        return codBancoEmisor;
    }

    public void setCodBancoEmisor(Integer codBancoEmisor) {
        this.codBancoEmisor = codBancoEmisor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codBancoEmisor == null) ? 0 : codBancoEmisor.hashCode());
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
        BancoEmisor other = (BancoEmisor) obj;
        if (codBancoEmisor == null) {
            if (other.codBancoEmisor != null)
                return false;
        } else if (!codBancoEmisor.equals(other.codBancoEmisor))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "BancoEmisor [codBancoEmisor=" + codBancoEmisor + ", nombre=" + nombre + ", pais=" + pais + "]";
    }

}
