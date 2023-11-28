package ufn.booksjpa.booksJPA.Service;

import org.springframework.stereotype.Service;

import ufn.booksjpa.booksJPA.Model.BooksModel;
import ufn.booksjpa.booksJPA.Repository.BookRepository;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<BooksModel> getAllBooks() {
        return bookRepository.findAll();
    }

    public BooksModel getBookByIsbn(Long isbn) {
        return bookRepository.findById(isbn).orElse(null);
    }

    public BooksModel addBook(BooksModel book) {
        if (bookRepository.existsById(book.getIsbn())) {
            return null;
        }
        return bookRepository.save(book);
    }

    public BooksModel updateBook(Long isbn, BooksModel updatedBook) {
        if (bookRepository.existsById(isbn)) {
            updatedBook.setIsbn(isbn);
            return bookRepository.save(updatedBook);
        }
        return null;
    }

    public boolean deleteBook(Long isbn) {
        if (bookRepository.existsById(isbn)) {
            bookRepository.deleteById(isbn);
            return true;
        }
        return false;
    }
}
