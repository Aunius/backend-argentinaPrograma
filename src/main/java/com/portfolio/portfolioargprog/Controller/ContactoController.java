package com.portfolio.portfolioargprog.Controller;

import org.springframework.web.bind.annotation.RestController;
import com.portfolio.portfolioargprog.dto.Contacto;
import java.io.InputStream;
import java.net.URLConnection;
import javax.validation.Valid;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@RestController
public class ContactoController {

    private final RestTemplate restTemplate;

    public ContactoController(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }
    
    @PostMapping("/contacto")
    public String contacto(@Valid @RequestBody Contacto contacto){
        String mensaje = contacto.getNombre()+" "+contacto.getEmail()+": "+contacto.getMensaje();
        String url = "https://api.telegram.org/bot5496215105:AAGDql-VItsDcrT2vsbocMA739M9cBEJXt8/sendMessage?chat_id=-1001615706397&text="+mensaje;

        this.restTemplate.getForObject(url, String.class);
        return "Mensaje enviado correctamente";
    }
}
