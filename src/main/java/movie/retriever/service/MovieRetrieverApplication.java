package movie.retriever.service;

public class MovieRetrieverApplication {
    public static void main(String[] args) {
        System.out.println("Older movies than 2000: " + new MovieRetrieverService().retrieveClassics(2000));
    }
}
