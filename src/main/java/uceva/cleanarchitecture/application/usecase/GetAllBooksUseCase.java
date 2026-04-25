package uceva.cleanarchitecture.application.usecase;

import uceva.cleanarchitecture.domain.entity.Book;
import uceva.cleanarchitecture.domain.repository.BookRepository;

import java.util.List;

public class GetAllBooksUseCase {
    private final BookRepository bookRepository;

    public GetAllBooksUseCase(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    public List<Book> execute(int countBooks){
        return bookRepository.getAll(countBooks);
    }
}
