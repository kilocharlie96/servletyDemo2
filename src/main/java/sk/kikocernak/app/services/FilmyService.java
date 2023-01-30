package sk.kikocernak.app.services;

import sk.kikocernak.app.model.Film;

import java.util.Arrays;
import java.util.List;

public class FilmyService {

    private List<Film> filmyMock = Arrays.asList(
            new Film("Quest","akcne"),
            new Film("Double Team","akcne"),
            new Film("Star Wars","scifi"),
            new Film("Stargate","scifi")
    );
    public List<Film> dajZoznamFilmovPodlaZanru(String zaner){

    }
}
