package movie.retriever.service.domain;

import java.util.Objects;

public class Movie {
    private String title;
    private int releasedYear;

    public Movie(String title, int releasedYear) {
        this.title = title;
        this.releasedYear = releasedYear;
    }

    public String getTitle() {
        return title;
    }

    public int getReleasedYear() {
        return releasedYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Movie movie = (Movie) o;
        return releasedYear == movie.releasedYear &&
            Objects.equals(title, movie.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, releasedYear);
    }
}
