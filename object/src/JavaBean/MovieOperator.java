package JavaBean;

public class MovieOperator {
    private Movie[] movies;

    public MovieOperator(Movie[] movies) {
        this.movies = movies;
    }

    public void printMovie() {
        System.out.println("电影信息如下:");

        for (int i = 0; i < movies.length ; i++) {
            Movie m = movies[i];
            System.out.println("电影名：" + m.getName());
            System.out.println("主演：" + m.getActor());
            System.out.println("得分：" + m.getScore());
        }
    }
}
