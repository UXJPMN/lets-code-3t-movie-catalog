package catalogo;

import java.util.ArrayList;

public class Catalog {
    ArrayList<Movie> movieList;

    Catalog() {
        movieList = new ArrayList<>();
    }

    Catalog(ArrayList<Movie> movieList) {
        this.movieList = movieList;
    }

    public void addMovie(Movie movie) {
        movieList.add(movie);
    }

    public void listMovies() {
        for (Movie movie: movieList) {
            System.out.println(movie.name);
        }
    }

    public Catalog filterByGenre(String genre) {
        Catalog newCatalog = new Catalog();

        for (Movie movie: movieList) {
            for (String movieGenre: movie.genre) {
                if (movieGenre.equals(genre)) {
                    newCatalog.addMovie(movie);
                }
            }
        }

        return  newCatalog;
    }

    public Catalog filterByDistributor(String distributorName) {
        Catalog newCatalog = new Catalog();

        for (Movie movie: movieList) {
            if (movie.distributor.name.equals(distributorName)) {
                newCatalog.addMovie(movie);
            }
        }

        return newCatalog;
    }
}
