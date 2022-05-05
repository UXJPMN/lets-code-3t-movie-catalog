package catalogo;

import java.util.Date;

public class Aula1 {
    public static void main(String[] args) {
        Catalog myCatalog = new Catalog();

        String[] hereditaryGenres = {"horror", "drama"};
        Distributor universalDistributor = new Distributor("Universal");
        Movie hereditary = new Movie("Hereditary", hereditaryGenres, universalDistributor);
        myCatalog.addMovie(hereditary);

        String[] jurassicWorldGenres = {"Adventure", "Action"};
        Movie jurassicWorld = new Movie("Jurassic World", jurassicWorldGenres, universalDistributor);
        myCatalog.addMovie(jurassicWorld);

        Catalog horrorMovies = myCatalog.filterByGenre("horror");
        System.out.println("Horror movies: ");
        horrorMovies.listMovies();

        System.out.println(" ");

        Catalog universalMovies = myCatalog.filterByDistributor("Universal");
        System.out.println("Movies by Universal: ");
        universalMovies.listMovies();
    }
}
