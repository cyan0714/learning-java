package JavaBean;

public class Test {
    public static void main(String[] args) {
        Movie[] movies = new Movie[3];
        movies[0] = new Movie("长津湖", "吴京", 9.7);
        movies[1] = new Movie("xxx", "吴京", 9.7);
        movies[2] = new Movie("yyy", "bbb", 8.9);

        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            System.out.println("电影名：" + m.getName());
            System.out.println("主演：" + m.getActor());
            System.out.println("得分：" + m.getScore());
        }
    }
}
