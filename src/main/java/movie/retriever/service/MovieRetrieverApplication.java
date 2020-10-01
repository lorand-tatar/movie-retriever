package movie.retriever.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MovieRetrieverApplication {

    @Autowired
    private MovieRetrieverService movieRetrieverService;

    public static void main(String[] args) {
        SpringApplication.run(MovieRetrieverApplication.class, args);
    }

    @Bean
    public CommandLineRunner print() {
        return (args) -> {
            System.out.println("Older movies than 2000: " + movieRetrieverService.retrieveClassics(Integer.valueOf(args[0])));
        };
    }
}
