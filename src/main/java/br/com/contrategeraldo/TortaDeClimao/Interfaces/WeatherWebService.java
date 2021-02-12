package br.com.contrategeraldo.TortaDeClimao.Interfaces;

import br.com.contrategeraldo.TortaDeClimao.Entities.Forecast;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherWebService {
    private RestTemplateBuilder builder;
    private RestTemplate template;

    public WeatherWebService() {
        this.builder = new RestTemplateBuilder();
        this.template = this.builder.build();
    }

    @Bean
    public Forecast getForecast(int woeid, RestTemplate template) throws Exception {
        String url = "https://api.hgbrasil.com/weather?woeid=" + woeid;
        return this.template.getForObject(url, Forecast.class);
    }
}
