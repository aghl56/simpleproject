package ru.mtuci.simpleproject;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ru.mtuci.simpleproject.dao.FilmsRepository;

@Component
public class CommandLineAppStartupRunner implements CommandLineRunner {
    private final FilmsRepository filmsRepository;

    @Autowired
    public CommandLineAppStartupRunner (FilmsRepository filmsRepository) {
        this.filmsRepository = filmsRepository;
    }

    @Override
    public void run(String...args) throws Exception{
        System.out.println(filmsRepository.findById(1L).get());
    }
}
