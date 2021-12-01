package br.com.unoseg.controllers;

import br.com.unoseg.services.IPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class IPController {
    @Autowired
    private IPService ipService;

    @GetMapping("")
    public ModelAndView getIP(){
        return new ModelAndView("homeIP");
    }
}
