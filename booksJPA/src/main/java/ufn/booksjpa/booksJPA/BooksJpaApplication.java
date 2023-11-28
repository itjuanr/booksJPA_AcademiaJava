package ufn.booksjpa.booksJPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan("ufn.booksjpa.booksJPA.Model")
@SpringBootApplication
public class BooksJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BooksJpaApplication.class, args);
	}

}
