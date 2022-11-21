package br.com.theshelf.repository;

import br.com.theshelf.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface BookRepository  extends JpaRepository<Book, Long> {


}
