package application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import application.record.GeneroDTO;
import application.service.GeneroService;

@RestController
@RequestMapping("/generos")
public class GeneroController {
    @Autowired
    private GeneroService generoService;

    @GetMapping
    public Iterable<GeneroDTO> list() {
        return generoService.getAll();
    }

    @GetMapping("/{id}")
    public GeneroDTO getOne(@PathVariable long id) {
        return generoService.getOne(id);
    }

    @PostMapping
    public GeneroDTO insert(@RequestBody GeneroDTO genero) {
        return generoService.insert(genero);
    }

    @PutMapping("/{id}")
    public GeneroDTO update(@PathVariable long id, @RequestBody GeneroDTO genero) {
        return generoService.update(id, genero);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        generoService.delete(id);
    }
}
