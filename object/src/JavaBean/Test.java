package JavaBean;

public class Test {
    public static void main(String[] args) {
        Movie[] movies = new Movie[3];
        movies[0] = new Movie("长津湖", "吴京", 9.7);
        movies[1] = new Movie("xxx", "吴京", 9.7);
        movies[2] = new Movie("yyy", "bbb", 8.9);

        MovieOperator mo = new MovieOperator(movies);
        mo.printMovie();
    }
}
