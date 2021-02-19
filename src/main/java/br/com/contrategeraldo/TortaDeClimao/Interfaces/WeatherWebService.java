package br.com.contrategeraldo.TortaDeClimao.Interfaces;

import br.com.contrategeraldo.TortaDeClimao.Entities.Forecast;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherWebService extends WebService {

    public WeatherWebService() {
        super.builder = new RestTemplateBuilder();
        super.template = super.builder.build();
        super.apiAddress = "https://apiprevmet3.inmet.gov.br"; // REST INMETRO
    }

    @Bean
    public Forecast getForecast(int geoId) throws Exception {
        String url = super.apiAddress + "/previsao/" + geoId;
        return super.template.getForObject(url, Forecast.class);
    }

    @Bean
    private Forecast getForecastFromApi(String parameter, String value) {
        return null;
    }
}
