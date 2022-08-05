import java.util.Map;
import java.util.List;

public class MoviePrinter {
    private final List<Movie> movieList;

    public MoviePrinter(List<Movie> movieList) {
        this.movieList = movieList;
    }

    public void printMovieList() {
        for(Movie filme : movieList) {
            String movieInfo = "";

            movieInfo += "\033[38;5;245mTítulo:\033[0m " + filme.getTitle() + "\n";

            movieInfo += "\033[38;5;245mPoster:\033[0m " + filme.getImage() + "\n";

            movieInfo += "\033[48;5;170mClassificação: " + filme.getImDbRating() +"\033[0m\n";

            for(int i = 0; i < Math.round(filme.getImDbRating()); i++) {
                movieInfo += "\033[38;5;220m" + "\uD83C\uDF1F" + "\033[0m";
            }

            System.out.println(movieInfo);
        }
    }
}
