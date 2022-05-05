package catalogo;

public class Distributor {
    String name;
    Movie[] distributorMovies;
    People[] distributorEmployees;

    public Distributor(String name, Movie[] movies, People[] peoples) {
        this.name = name;
        this.distributorMovies = movies;
        this.distributorEmployees = peoples;
    }

    public Distributor(String name) {
        this.name = name;
        this.distributorMovies = new Movie[0];
        this.distributorEmployees = new People[0];
    }
}
