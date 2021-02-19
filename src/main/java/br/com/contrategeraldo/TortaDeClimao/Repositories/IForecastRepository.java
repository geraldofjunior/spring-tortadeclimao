package br.com.contrategeraldo.TortaDeClimao.Repositories;

import br.com.contrategeraldo.TortaDeClimao.Entities.Forecast;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IForecastRepository extends CrudRepository<Forecast, Long> {
    List<Forecast> findByGeoId(int geoId);
    List<Forecast> findByTownName(String name);
}
