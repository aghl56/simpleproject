package ru.mtuci.simpleproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mtuci.simpleproject.dao.FilmsRepository;
import ru.mtuci.simpleproject.model.Films;

import java.util.List;

@Service
public class FilmServiceImpl implements FilmService {

    private final FilmsRepository filmsRepository;

    @Autowired
    public FilmServiceImpl(FilmsRepository filmsRepository) {
        this.filmsRepository = filmsRepository;
    }

    @Override
    public Films get(Long id) {
        return filmsRepository.findById(id).orElse(null);
    }

    @Override
    public List<Films> getAll() {
        return filmsRepository.findAll();
    }

    @Override
    public Films save(Films films) {
        return filmsRepository.save(films);
    }

    @Override
    public void delete(Long id) {
        filmsRepository.delete(id);

    }
}
