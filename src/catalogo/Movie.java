package catalogo;

public class Movie {
    String name;
    int rating;
    String[] genre;
    String language;
    People[] directors;
    People[] producers;
    People[] writers;
    int criticsScore;
    int audienceScore;
    Distributor distributor;

    public Movie(String name, int rating, String[] genre, String language, People[] directors, People[] producers, People[] writers, int criticsScore, int audienceScore, Distributor distributor) {
        this.name = name;
        this.rating = rating;
        this.genre = genre;
        this.language = language;
        this.directors = directors;
        this.producers = producers;
        this.writers = writers;
        this.criticsScore = criticsScore;
        this.audienceScore = audienceScore;
        this.distributor = distributor;
    }

    public Movie(String name) {
        this.name = name;
    }

    public Movie(String name, String[] genre, Distributor distributors) {
        this.name = name;
        this.genre = genre;
        this.distributor = distributors;
    }
}
