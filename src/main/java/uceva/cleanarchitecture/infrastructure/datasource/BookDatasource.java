package uceva.cleanarchitecture.infrastructure.datasource;

import com.github.javafaker.Faker;
import uceva.cleanarchitecture.domain.entity.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class BookDatasource {

    private Faker faker = new Faker();
    private final Random random = new Random();
    private final String[] genres = {
            "Ficción",
            "No Ficción",
            "Ciencia Ficción",
            "Fantasía",
            "Misterio",
    };

    public List<Book> getAll(int countBooks){
        List<Book> books = new ArrayList<Book>();
        for (int i = 1; i <= countBooks; i++) {
            books.add(generateBook(i));
        }
        return books;
    }

    private Book generateBook(Integer id){
        return new Book(
                id,
                faker.book().title(),
                faker.book().author(),
                randomGenre(),
                faker.number().numberBetween(1900, 2024),
                (float) faker.number().numberBetween(10000, 100000)
        );
    }

    private String randomGenre() {
        return genres[random.nextInt(genres.length)];
    }

}
