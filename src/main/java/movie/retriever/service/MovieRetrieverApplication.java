package movie.retriever.service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MovieRetrieverApplication {
    public static void main(String[] args) {
        SpringApplication.run(MovieRetrieverApplication.class, args);
    }

    @Bean
    public CommandLineRunner print() {
        return (args) -> {
            System.out.println("Older movies than 2000: " + new MovieRetrieverService().retrieveClassics(Integer.valueOf(args[0])));
        };
    }
}
