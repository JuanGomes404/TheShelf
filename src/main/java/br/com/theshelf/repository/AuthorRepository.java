package br.com.theshelf.repository;


import br.com.theshelf.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;



public interface AuthorRepository extends JpaRepository<Author, Long> {


}
