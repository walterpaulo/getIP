package br.com.unoseg.getIP.controllers;

import br.com.unoseg.getIP.services.IPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
@RequestMapping("")
public class IPController {
    private final String PAGINA_IP = "homeIP";
    @Autowired
    private IPService ipService;

    @GetMapping("/")
    public ModelAndView index() {
        System.out.println(ipService.get().getCity());
        return new ModelAndView(PAGINA_IP,"IPService", ipService.get());
    }
}
