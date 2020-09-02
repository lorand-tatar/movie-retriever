package movie.retriever.service.repository;

import java.util.List;

import movie.retriever.service.domain.Movie;

public class VanillaMovieRepository implements MovieRepository {

    public List<Movie> findAll() {
        return List.of(new Movie("A Beautiful Mind", 2001),
            new Movie("The Hitchhiker’s Guide to the Galaxy", 2005),
            new Movie("Star Wars: Episode IV - A New Hope", 1977),
            new Movie("Back to the Future", 1985),
            new Movie("Good Will Hunting", 1997),
            new Movie("A Beautiful Mind", 2001));
    }
}
