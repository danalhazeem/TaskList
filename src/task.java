import java.util.List;
import java.util.ArrayList;


public class task {
    public static void main(String[] args) {
        List <String> movies = new ArrayList<>();

        movies.add("Awakenings");
        movies.add("A Time to Kill");
        movies.add("Almost Famous");
        movies.add("Ali");
        movies.add("Angel Eyes");

        movies.remove("A Time to Kill");

        for (String movie : movies) {
            System.out.println(movie);
        }


    }
}
