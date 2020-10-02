package movie.retriever.service.repository;

import java.util.List;

import movie.retriever.service.domain.Movie;

public interface MovieRepository {

    List<Movie> findAll();

}
