package com.api.eventos.model;

import java.time.LocalDateTime;

public class Evento {

    private Long id;
    private String nomeEvento;
    private String localEvento;
    private LocalDateTime dataEvento;

    
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
    public LocalDateTime getDataEvento() {
        return dataEvento;
    }
    public void setDataEvento(LocalDateTime dataEvento) {
        this.dataEvento = dataEvento;
    }


    

    
}
