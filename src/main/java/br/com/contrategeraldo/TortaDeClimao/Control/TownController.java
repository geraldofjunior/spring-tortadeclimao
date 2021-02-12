package br.com.contrategeraldo.TortaDeClimao.Control;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import br.com.contrategeraldo.TortaDeClimao.Repositories.ITownRepository;
import br.com.contrategeraldo.TortaDeClimao.Entities.Town;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TownController {
    ITownRepository townRepository;

    public TownController(ITownRepository townRepository) {
        this.townRepository = townRepository;
    }

    @GetMapping("towns")
    public Iterable<Town> getAllRegisteredTowns() {
        return townRepository.findAll();
    }

    @GetMapping("towns/{id}")
    public Town getRegisteredTown(@PathVariable("id") Long id) {
        return townRepository.findById(id).get();
    }

    @PostMapping("/towns/")
    public HttpStatus addTown(@RequestBody Town town) {
        townRepository.save(town);
        return HttpStatus.CREATED;
    }
}
