package br.com.contrategeraldo.TortaDeClimao.Interfaces;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class WebService {
    protected RestTemplateBuilder builder;
    protected RestTemplate template;
    protected String apiAddress;

    protected void getFromWebService(String search, String ApiAddress) {

    }
}
