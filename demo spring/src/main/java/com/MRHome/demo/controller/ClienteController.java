package com.MRHome.demo.controller;
import com.MRHome.demo.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping("/")
    public String verPaginaInicio (Model modelo){
        modelo.addAttribute("clientes", clienteRepository.findAll());
        return "index";
    }

    @

}
