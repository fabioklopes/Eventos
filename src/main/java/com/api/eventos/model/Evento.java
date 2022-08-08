package com.api.eventos.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "eventos")
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nomeEvento;
    private String localEvento;
    private String dataEvento;
    private String horaEvento;
    
    @Override
    public String toString() {
        return "Evento [id=" + id + ", nomeEvento=" + nomeEvento + ", localEvento=" + localEvento + ", dataEvento=" + dataEvento + ", horaEvento=" + horaEvento + "]";
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNomeEvento() {
        return nomeEvento;
    }
    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }
    public String getLocalEvento() {
        return localEvento;
    }
    public void setLocalEvento(String localEvento) {
        this.localEvento = localEvento;
    }
    public String getDataEvento() {
        return dataEvento;
    }
    public void setDataEvento(String dataEvento) {
        this.dataEvento = dataEvento;
    }
    public String getHoraEvento() {
        return horaEvento;
    }
    public void setHoraEvento(String horaEvento) {
        this.horaEvento = horaEvento;
    }
    
}
