package uceva.cleanarchitecture.infrastructure.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uceva.cleanarchitecture.application.usecase.GetAllBooksUseCase;
import uceva.cleanarchitecture.domain.entity.Book;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final GetAllBooksUseCase getAllBooksUseCase;

    public BookController(GetAllBooksUseCase getAllBooksUseCase){
        this.getAllBooksUseCase = getAllBooksUseCase;
    }

    @GetMapping("/{countBooks}")
    public List<Book> getAll(@PathVariable int countBooks) {
        return getAllBooksUseCase.execute(countBooks);
    }

}
