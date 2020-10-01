package movie.retriever.service;

import static java.lang.String.join;
import static java.util.Comparator.naturalOrder;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import movie.retriever.service.domain.Movie;
import movie.retriever.service.repository.MovieRepository;

@Service
public class MovieRetrieverService {
    private MovieRepository movieRepository;

    public MovieRetrieverService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public String retrieveClassics(int olderThan) {
        List<String> titles = new ArrayList<>();
        for (Movie movie : movieRepository.findAll()) {
            if (movie.getReleasedYear() < olderThan) {
                titles.add(movie.getTitle().toUpperCase());
            }
        }
        titles.sort(naturalOrder());
        return join(", ", titles);
    }
}
