package uceva.cleanarchitecture.domain.repository;

import uceva.cleanarchitecture.domain.entity.Book;

import java.util.List;

public abstract class BookRepository {
    public abstract List<Book> getAll(int countBooks);
}
