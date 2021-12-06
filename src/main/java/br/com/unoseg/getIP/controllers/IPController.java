package br.com.unoseg.getIP.controllers;

import br.com.unoseg.getIP.models.IPModel;
import br.com.unoseg.getIP.services.IPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;
import java.util.regex.Pattern;

@Controller
@RequestMapping("/")
public class IPController {
    private final String PAGINA_IP = "homeIP";
    @Autowired
    private IPService ipService;

    @GetMapping("/")
    public ModelAndView index() {
        System.out.println(ipService.get().getCity());
        return new ModelAndView(PAGINA_IP,"IPService", ipService.get());
    }
     @PostMapping
    public ModelAndView getIP(String ip) {
        IPModel obj = new IPModel();
        if(!isIP(ip)){
            obj.setStatus("fail");
            return new ModelAndView(PAGINA_IP,"IPService", obj);
        }else {
            obj = ipService.get(ip);
            System.out.println(obj.getRegion());
            return new ModelAndView(PAGINA_IP,"IPService", obj);
        }
    }
    private boolean isIP(String ip){
        boolean objIP = Pattern.matches("[0-9]{1,3}.[0-9]{1,3}.[0-9]{1,3}.[0-9]{1,3}", ip);
        return objIP;
    }
}
