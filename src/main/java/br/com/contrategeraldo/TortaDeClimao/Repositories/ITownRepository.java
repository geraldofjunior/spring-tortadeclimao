package br.com.contrategeraldo.TortaDeClimao.Repositories;

import br.com.contrategeraldo.TortaDeClimao.Entities.Town;
import org.springframework.data.repository.CrudRepository;

public interface ITownRepository extends CrudRepository<Town, Long> {
}
