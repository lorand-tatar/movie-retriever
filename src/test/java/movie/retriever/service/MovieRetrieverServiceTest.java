package movie.retriever.service;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import movie.retriever.service.domain.Movie;
import movie.retriever.service.repository.MovieRepository;

@ExtendWith(MockitoExtension.class)
class MovieRetrieverServiceTest {

    @Test
    void testRetrieveClassics() {
        var movieRepository = mock(MovieRepository.class);
        var movieRetrieverService = new MovieRetrieverService(movieRepository);
        var expectedResult = "MOVIE1, MOVIE2, MOVIE3";
        when(movieRepository.findAll())
            .thenReturn(List.of(new Movie("Movie1", 1990),
                                new Movie("Movie2", 1998),
                                new Movie("Movie3", 1995),
                                new Movie("Movie4", 2020)));

        var actualResult = movieRetrieverService.retrieveClassics(2000);

        assertTrue(expectedResult.equals(actualResult));
    }

}
