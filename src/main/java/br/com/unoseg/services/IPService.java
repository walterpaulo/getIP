package br.com.unoseg.services;

import br.com.unoseg.models.IPModel;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class IPService {
    private String urlAPI = "http://ip-api.com/json/";

    public IPModel get(){
        template();
        IPModel ipModelObj = template().getForObject(urlAPI,IPModel.class);
        return ipModelObj;
    }

    public IPModel get(String IP){
        template();
        IPModel ipModelObj = template().getForObject(urlAPI+IP,IPModel.class);
        return ipModelObj;
    }

    private RestTemplate template(){
        RestTemplate restTemplate = new RestTemplate();
        RestTemplateBuilder restTemplateBuilder = new RestTemplateBuilder();
        restTemplate = restTemplateBuilder.build();
        return restTemplate;
    }
    

}
