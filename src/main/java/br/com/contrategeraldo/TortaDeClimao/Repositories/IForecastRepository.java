package br.com.contrategeraldo.TortaDeClimao.Repositories;

import br.com.contrategeraldo.TortaDeClimao.Entities.Forecast;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IForecastRepository extends CrudRepository<Forecast, Long> {
    List<Forecast> findByTownId(Long townID);
    List<Forecast> findByWoeid(int woeid);
}
