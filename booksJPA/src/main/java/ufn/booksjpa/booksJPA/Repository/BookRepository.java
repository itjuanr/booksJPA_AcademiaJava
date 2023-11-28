package ufn.booksjpa.booksJPA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ufn.booksjpa.booksJPA.Model.BooksModel;

public interface BookRepository extends JpaRepository<BooksModel, Long> {
}
