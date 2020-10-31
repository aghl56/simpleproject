package ru.mtuci.simpleproject.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.mtuci.simpleproject.model.Films;
import ru.mtuci.simpleproject.service.FilmService;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = FilmController.REST_URL, produces = MediaType.APPLICATION_JSON_VALUE)
public class FilmController {
    public static final String REST_URL = "/api/v1/films";
    private FilmService filmService;
    @Autowired
    public FilmController(FilmService filmService) {
        this.filmService = filmService;
    }

    @GetMapping
    public List<Films> getAll() {
        log.info("getAll");
        return filmService.getAll();
    }

    @GetMapping (value = "/{id}")
    public Films get(@PathVariable("id") Long id) {
        log.info("get" + id);
        return filmService.get(id);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Films save(@RequestBody Films films) {
        log.info("save" + films);
        return filmService.save(films);
    }

    @DeleteMapping ("/{id}")
    @ResponseStatus (value = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") Long id) {
        log.info("delete" + id);
        filmService.delete(id);
    }
}
