package ufn.booksjpa.booksJPA.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import ufn.booksjpa.booksJPA.Model.BooksModel;
import ufn.booksjpa.booksJPA.Service.BookService;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class BooksController {

    private final BookService bookService;

    public BooksController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<BooksModel> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/{isbn}")
    public ResponseEntity<BooksModel> getBookByIsbn(@PathVariable Long isbn) {
        BooksModel book = bookService.getBookByIsbn(isbn);
        return book != null
                ? new ResponseEntity<>(book, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity<BooksModel> addBook(@RequestBody BooksModel book) {
        BooksModel addedBook = bookService.addBook(book);
        return new ResponseEntity<>(addedBook, HttpStatus.CREATED);
    }

    @PutMapping("/{isbn}")
    public ResponseEntity<BooksModel> updateBook(@PathVariable Long isbn, @RequestBody BooksModel book) {
        BooksModel updatedBook = bookService.updateBook(isbn, book);
        return updatedBook != null
                ? new ResponseEntity<>(updatedBook, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{isbn}")
    public ResponseEntity<Void> deleteBook(@PathVariable Long isbn) {
        boolean deleted = bookService.deleteBook(isbn);
        return deleted
                ? new ResponseEntity<>(HttpStatus.NO_CONTENT)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
