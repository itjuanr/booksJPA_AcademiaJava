package ufn.booksjpa.booksJPA.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class BooksModel {
    
    @Id
    private Long isbn;
    
    private String titulo;
    private String autor;
    private String genero;
    private double preco;

    public BooksModel() {
    }

    public BooksModel(String titulo, String autor, Long isbn, String genero, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.genero = genero;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
