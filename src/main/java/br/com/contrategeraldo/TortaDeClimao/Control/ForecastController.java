package br.com.contrategeraldo.TortaDeClimao.Control;

import br.com.contrategeraldo.TortaDeClimao.Entities.Forecast;
import br.com.contrategeraldo.TortaDeClimao.Repositories.IForecastRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ForecastController {

    private IForecastRepository forecastRepository;

    public ForecastController(IForecastRepository forecastRepository) {
        this.forecastRepository = forecastRepository;
    }

    @GetMapping("forecasts")
    public Forecast getDefaultForecast() {
        return forecastRepository.findById(1l).get();
    }

    @GetMapping("forecasts/{townID}")
    public List<Forecast> getForecastByTownId(@PathVariable("townID") Long townID) {
        return forecastRepository.findByTownId(townID);
    }

}
