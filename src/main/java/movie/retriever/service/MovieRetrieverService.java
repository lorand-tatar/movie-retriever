package movie.retriever.service;

import static java.lang.String.join;

import java.util.ArrayList;
import java.util.List;

import movie.retriever.service.domain.Movie;
import movie.retriever.service.repository.MovieRepository;
import movie.retriever.service.repository.VanillaMovieRepository;

public class MovieRetrieverService {
    private MovieRepository movieRepository;

    public MovieRetrieverService() {
        this.movieRepository = new VanillaMovieRepository();
    }

    public String retrieveClassics(int olderThan) {
        List<String> titles = new ArrayList<>();
        for (Movie movie : movieRepository.findAll()) {
            if (movie.getReleasedYear() < olderThan) {
                titles.add(movie.getTitle());
            }
        }
        return join(", ", titles);
    }
}
