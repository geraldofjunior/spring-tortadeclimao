package br.com.contrategeraldo.TortaDeClimao.Interfaces;

import br.com.contrategeraldo.TortaDeClimao.Entities.Town;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TownWebService extends WebService {

    public TownWebService() {
        super.builder = new RestTemplateBuilder();
        super.template = super.builder.build();
        super.apiAddress = "https://servicodados.ibge.gov.br/api/v1"; // REST IBGE
    }

    @Bean
    private Town getTown(String searchData) {
        String url = super.apiAddress + "/localidades/municipios/" + searchData;
        return super.template.getForObject(url, Town.class);
    }
}