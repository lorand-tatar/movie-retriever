package movie.retriever.service;

import movie.retriever.service.repository.MovieRepository;
import movie.retriever.service.repository.VanillaMovieRepository;

public class MovieRetrieverApplication {

    public static void main(String[] args) {
        MovieRepository movieRepository = new VanillaMovieRepository();
        System.out.println("Older movies than 2000: " + new MovieRetrieverService(movieRepository).retrieveClassics(2000));
    }

}
