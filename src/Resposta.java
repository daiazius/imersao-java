import com.fasterxml.jackson.annotation.JsonAlias;

import java.util.List;

public class Resposta {
    @JsonAlias("items")
    private List<Movie> movieList;
    private String errorMessage;

    public Resposta() {}

    public Resposta(List<Movie> movieList, String errorMessage) {
        this.movieList = movieList;
        this.errorMessage = errorMessage;
    }

    public List<Movie> getMovieList() {
        return this.movieList;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

}
