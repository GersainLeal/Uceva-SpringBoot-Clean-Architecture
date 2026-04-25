package uceva.cleanarchitecture.infrastructure.repository;

import uceva.cleanarchitecture.domain.entity.Book;
import uceva.cleanarchitecture.domain.repository.BookRepository;
import uceva.cleanarchitecture.infrastructure.datasource.BookDatasource;

import java.util.List;

public class BookRepositoryImpl extends BookRepository {

    private final BookDatasource bookDatasource;

    public BookRepositoryImpl(BookDatasource bookDatasource){
        this.bookDatasource = bookDatasource;
    }

    @Override
    public List<Book> getAll(int countBooks) {
        return bookDatasource.getAll(countBooks);
    }
}
