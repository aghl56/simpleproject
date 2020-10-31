package ru.mtuci.simpleproject.service;

import ru.mtuci.simpleproject.model.Films;

import java.util.List;

public interface FilmService {
    Films get(Long id);
    List<Films> getAll();
    Films save (Films films);
    void delete (Long id);
}
