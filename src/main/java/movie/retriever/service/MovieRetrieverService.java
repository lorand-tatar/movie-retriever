package movie.retriever.service;

import java.util.stream.Collectors;

import movie.retriever.service.repository.MovieRepository;

public class MovieRetrieverService {

    private MovieRepository movieRepository;

    public MovieRetrieverService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public String retrieveClassics(int olderThan) {
        return movieRepository.findAll()
                                .stream()
                                .filter(movie -> movie.getReleasedYear() < olderThan)
                                .map(movie -> movie.getTitle().toUpperCase())
                                .sorted()
                                .collect(Collectors.joining(", "));
    }

}
