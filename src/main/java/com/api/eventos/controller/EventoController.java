package com.api.eventos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.api.eventos.model.Evento;
import com.api.eventos.repositories.EventoRepository;

@Controller
public class EventoController {

    @Autowired
    private EventoRepository repository;

    @RequestMapping("/eventos/criar")
    public String form() {
        return "criarEvento";
    }

    @PostMapping("/eventos")
    public String create(Evento evento) {
        repository.save(evento);

        return "eventoCriado";
    }
    
}
