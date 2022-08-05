import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown= true)
public class Movie {
    private String title;
    private String image;
    private float imDbRating;

    public Movie() {
    }

    public Movie(String title, String image, float imDbRating) {
        this.title = title;
        this.image = image;
        this.imDbRating = imDbRating;
    }

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public float getImDbRating() {
        return imDbRating;
    }

}
